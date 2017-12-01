package no.ronny.oauth;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import com.github.scribejava.apis.FacebookApi;
import com.github.scribejava.apis.GoogleApi20;
import com.github.scribejava.apis.LinkedInApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;

import no.ronny.oauth.helpers.RandomString;

public class LinkedInGetter 
{
	public enum OAuthService 
	{
	    LinkedIn, Google, FaceBook 
	}
	
	OAuth20Service   serviceObject;
	OAuth2AccessToken token;
	OAuthService usedService;
	String state;
	
	private static final Map<OAuthService, String> ProtectedURL = createMap();

    private static Map<OAuthService, String> createMap() {
        Map<OAuthService, String> result = new HashMap<OAuthService, String>();
        result.put(OAuthService.LinkedIn, "https://api.linkedin.com/v1/people/~:(firstName,lastName,public-profile-url,email-address,positions)?format=json");
        result.put(OAuthService.Google, "https://www.googleapis.com/oauth2/v1/userinfo?alt=json");
        result.put(OAuthService.FaceBook, "https://graph.facebook.com/v2.11/me");
        return Collections.unmodifiableMap(result);
    }
	
	public LinkedInGetter(String clientId, String clientSecret,String url,OAuthService serviceUsed) throws NoSuchAlgorithmException
	{
		
		RandomString random=new RandomString(20);
		state=random.nextString();
		usedService=serviceUsed;
		
		if(usedService==OAuthService.LinkedIn)
			serviceObject = new ServiceBuilder(clientId)
                .apiSecret(clientSecret)
                .scope("r_basicprofile r_emailaddress") // replace with desired scope
                .callback(url)
                .state("some_params")
                .build(LinkedInApi20.instance());
		if(usedService==OAuthService.Google)
			serviceObject = new ServiceBuilder(clientId)
                .apiSecret(clientSecret)
                .scope("profile email") // replace with desired scope
                .callback(url)
                .state("some_params")
                .build(GoogleApi20.instance());
		if(usedService==OAuthService.FaceBook)
			serviceObject = new ServiceBuilder(clientId)
                .apiSecret(clientSecret)
                .scope("profile") // replace with desired scope
                .callback(url)
                .state("some_params")
                .build(FacebookApi.instance());
	}
	
	public String getAuthURL()
	{
		return serviceObject.getAuthorizationUrl();
		
	}
	
	public void getAccessToken(String code) throws IOException, InterruptedException, ExecutionException
	{
		 token= serviceObject.getAccessToken(code);
		
	}
	
	public String getProtectedData() throws InterruptedException, ExecutionException, IOException
	{
		OAuthRequest request = new OAuthRequest(Verb.GET,ProtectedURL.get(usedService));
        request.addHeader("x-li-format", "json");
       // request.addHeader("Accept-Language", "ru-RU");
        serviceObject.signRequest(token, request);
        final Response response = serviceObject.execute(request);
        return response.getBody();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  // Replace these with your client id and secret
        final String clientId = "77vk2hh3ffx5pf";
        final String clientSecret = "jh2j1pCMgjwCUILh";
        
        String clientIdGoogle="469656622643-cgt6j3di1a41ikbcd1c2375iua987jko.apps.googleusercontent.com";
        String clientSecretGoogle="Ukp8Bz2kUQTfckvBhtgW0hO-";
        
        String clientIdFB="375669452871726";
        String clientSecretFB="d5096717c9b28777759d780303e33171";
        //LinkedInGetter getter=new LinkedInGetter(clientIdGoogle, clientSecretGoogle, "http://localhost", OAuthService.Google);
        //LinkedInGetter getter=new LinkedInGetter(clientIdFB, clientSecretFB, "http://localhost", OAuthService.FaceBook);
        
        
        try {
        		LinkedInGetter getter=new LinkedInGetter(clientId, clientSecret, "http://localhost", OAuthService.LinkedIn);
            System.out.println(getter.getAuthURL());
            Scanner in = new Scanner(System.in);
            System.out.print("Code--->>");
            final String code = in.nextLine();
            System.out.println();
			getter.getAccessToken(code);
			
			System.out.println(getter.getProtectedData());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
        
        
	}
	

}
