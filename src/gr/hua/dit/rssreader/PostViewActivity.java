package gr.hua.dit.rssreader;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class PostViewActivity extends Activity {

	private WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		this.setContentView(R.layout.postview);
		Bundle bundle = this.getIntent().getExtras();
		String postContent = bundle.getString("content");
		//webview bug, need to convert this special character
		postContent = postContent.replace("%", "%25");
		postContent = postContent.replace("'", "%27");
		postContent = postContent.replace("#", "%23");
		
		webView = (WebView) this.findViewById(R.id.webview);
		webView.loadData(postContent, "text/html; charset=utf-8", "utf-8");
	}


	@Override
	protected void onDestroy() {
		
		super.onDestroy();
	}
}
