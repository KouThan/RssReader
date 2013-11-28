package gr.hua.dit.rssreader;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

/*This one has to get changed 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
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
		Log.w("myApp","added: " + postContent);
		if (bundle.isEmpty())
			Log.w("myApp","Empty bundle");
		webView = (WebView) this.findViewById(R.id.webview);
		webView.loadData(postContent, "text/html; charset=utf-8", "utf-8");
	}


	@Override
	protected void onDestroy() {
		
		super.onDestroy();
	}
}
