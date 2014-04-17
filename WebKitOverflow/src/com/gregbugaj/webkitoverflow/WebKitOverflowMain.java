package com.gregbugaj.webkitoverflow;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
/**
 * Activity to test DIV Scrolling in webview
 * @author devil
 *
 */
public class WebKitOverflowMain extends Activity {

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      
        setContentView(R.layout.main);
      
        WebView webview =  (WebView) findViewById(R.id.webView1);

		WebSettings settings=webview.getSettings();
		settings.setJavaScriptEnabled(true);
		settings.setSavePassword(false);
		settings.setSaveFormData(false);
		webview.setVerticalScrollBarEnabled(false);
		
		webview.setWebChromeClient(new MyWebChromeClient());
		
		/*webview.loadUrl("file:///android_asset/index.html");
        setContentView(webview);*/
        
        
        //Added Code
		
		StringBuilder judgementTextHtml = new StringBuilder();
		
		judgementTextHtml.append("<div id=\"first\">Do not go gentle into that good night Old age should burn and rave at close of day </div><div id=\"second\">Rage rage against the dying of the light  Though wise men at their end know dark is right Because their words had forked no lightning they Do not go gentle into that good night  Good men the last wave by crying how bright Their frail deeds might have danced in a green bay Rage rage against the dying of the light  Wild men who caught and sang the sun in flight </div><div id=\"third\">And learn too late they grieved it on its way Do not go gentle into that good night  Grave men near death who see with blinding sight Blind eyes could blaze like meteors </div><div id=\"fourth\">and be gay Rage rage against the dying of the light  And you my father there on that sad height</div><div id=\"five\"> Curse bless me now with your fierce tears I pray Do not go gentle into that good night Rage rage against the dying of the light  When I am an old woman I shall wear purple With a red hat which doesnt go and doesnt suit me And I shall spend my pension on brandy and summer gloves And satin sandals and say weve no money for butter I shall sit down on the pavement when Im tired And gobble up samples in shops and press alarm bells And run my stick </div><div id=\"six\">along the public railings And make up for the sobriety of my youth I shall go out in my slippers </div><div id=\"seven\">in the rain And pick flowers in other peoples gardens And learn to spit  You can wear terrible shirts and grow more fat And eat three pounds of sausages at a go Or only bread and pickle for a week And hoard pens and pencils and beermats</div><div id=\"eight\"> and things in boxes  But now we must have clothes that keep us dry And pay our rent and not swear in the street And set a good example for the children We must have friends to dinner and read the papers  But maybe I ought to practice a little now So people who know me are not too shocked </div><div id=\"nine\">and surprised When suddenly I am old and start to wear purple  Out of the night that covers me Black as the Pit from pole to pole I thank whatever gods may be For my unconquerable soul  In the fell clutch of circumstance </div><div id=\"ten\">I have not winced nor cried aloud Under the bludgeonings of chance My head is bloody but unbowed  Beyond this place of wrath and tears Looms </div><div id=\"eleven\">but the Horror of the shade And yet the menace of the years Finds and shall find me unafraid  It matters not how strait the gate How charged with punishments the scroll I am the master of my fate I am the captain of my soul </div><div id=\"twelve\"> It was many and many a year ago In a kingdom by the sea That a maiden there lived whom you may know By the name of ANNABEL LEE And this maiden she lived with</div><div id=\"thirteen\"> no other thought Than to love and be loved by me  I was a child and she was a child In this kingdom by the sea But we loved with a love that was more than love</div><div id=\"fourteen\"> I and my Annabel Lee With a love that the winged</div><div id=\"fifteen\"> seraphs of heaven Coveted her and me</div>");
        
        StringBuilder htmlContent = new StringBuilder();
		
		htmlContent.append("<!DOCTYPE html>")
		
		.append("<head>")
		
		.append("<meta name=\"viewport\" content=\"width=device-width\"/>")

		.append("<script src=\"file:///android_asset/jquery.js\"></script>") 

		.append("<script>")

		.append("$(document).ready(function() {var div=$(\"#seven\"); div.get(0).scrollIntoView(); div.animate({fontSize:'2em'},\"slow\");});")
		
		//.append("$(document).ready(function() {$('#seven').get(0).scrollIntoView();});")

		.append("</script>")

		.append("</head><body>"+judgementTextHtml+"</body></html>");
		
		webview.loadDataWithBaseURL("file:///android_asset", htmlContent.toString(), "text/html", "UTF-8", null);
		
		

		judgementTextHtml = null;
		
        
    }
}
