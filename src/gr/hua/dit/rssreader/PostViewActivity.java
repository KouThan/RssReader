package gr.hua.dit.rssreader;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;


public class PostViewActivity extends Activity {

	private WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		//gets the array list and bundles it
		this.setContentView(R.layout.postview);
		Bundle bundle = this.getIntent().getExtras();
		
		
		String postContent = bundle.getString("content");
		
		//opens a web view to present the contents
		webView = (WebView) this.findViewById(R.id.webview);
		webView.loadData(postContent, "text/html; charset=utf-8", "utf-8");
	}


	@Override
	protected void onDestroy() {
		
		super.onDestroy();
	}
}
