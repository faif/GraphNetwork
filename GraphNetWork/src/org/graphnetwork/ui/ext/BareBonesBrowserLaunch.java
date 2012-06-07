
/////////////////////////////////////////////////////////
//  Bare Bones Browser Launch                          //
//  Version 1.5                                        //
//  December 10, 2005                                  //
//  Supports: Mac OS X, GNU/Linux, Unix, Windows XP    //
//  Example Usage:                                     //
//     String url = "http://www.centerkey.com/";       //
//     BareBonesBrowserLaunch.openURL(url);            //
//  Public Domain Software -- Free to Use as You Like  //
/////////////////////////////////////////////////////////

/**
 * Extended by: Athanasios Kasampalis (January 2007)
 */

/* PEND: replace this class by the time Sun will create
 * a standard way for launching web browsers in a portable
 * manner... */

package org.graphnetwork.ui.ext;

import java.lang.reflect.Method;
import javax.swing.JOptionPane;

public class BareBonesBrowserLaunch {
    private static final Object ERRMSG[] = { 
        "Unable to launch a web browser,",
        "most probably due to security reasons.",
        "Please visit this web location (URL) manually."
    };
    
    private static final String ERRTITLE = "Error!";
    
    /**
     * @param url a full http url to open (ie http://www.it.teithe.gr)
     *
     * @return true if the browser started succesfully
     */
    public static boolean openURL(String url) {
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Mac OS")) {
                Class fileMgr = Class.forName("com.apple.eio.FileManager");
                Method openURL = fileMgr.getDeclaredMethod("openURL",
                        new Class[] {String.class});
                openURL.invoke(null, new Object[] {url});
            } else if (osName.startsWith("Windows"))
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            else { //assume Unix or GNU/Linux
                String[] browsers = {
                    "firefox",
                    "mozilla-firefox",
                    "FireFox",
                    "epiphany",
                    "Epiphany",
                    "galeon",
                    "Galeon",
                    "konqueror",
                    "Konqueror",
                    "mozilla",
                    "Mozilla",
                    "netscape",
                    "Netscape",
                    "opera",
                    "Opera"
                };
                String browser = null;
                for (int count = 0; count < browsers.length && browser == null; count++)
                    if (Runtime.getRuntime().exec(
                        new String[] {"which", browsers[count]}).waitFor() == 0)
                        browser = browsers[count];
                if (browser == null)
                    throw new Exception("Could not find an appropriate web browser!");
                else
                    Runtime.getRuntime().exec(new String[] {browser, url});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ERRMSG, ERRTITLE, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
