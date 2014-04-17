package com.gregbugaj.webkitoverflow;

import android.util.Log;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;


/**
 * Provides a hook for calling "alert" from javascript. Useful for
 * debugging your javascript.
 */
final class MyWebChromeClient extends WebChromeClient {
	private static final String TAG = MyWebChromeClient.class.getSimpleName();

	@Override
	public void onProgressChanged(WebView view, int newProgress) {
		//Log.d(TAG, "Progress :"+newProgress);
		super.onProgressChanged(view, newProgress);
	}
	@Override
	public boolean onJsAlert(WebView view, String url, String message, JsResult result) {

		Log.d(TAG, message);
		
		result.confirm();
		return true;
	}


}
