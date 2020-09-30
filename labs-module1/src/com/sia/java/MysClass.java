package com.sia.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.apache.directory.api.ldap.model.cursor.EntryCursor;
import org.apache.directory.api.ldap.model.entry.DefaultEntry;
import org.apache.directory.api.ldap.model.entry.Entry;
import org.apache.directory.api.ldap.model.exception.LdapException;
import org.apache.directory.api.ldap.model.message.SearchScope;
import org.apache.directory.ldap.client.api.LdapConnection;
import org.apache.directory.ldap.client.api.LdapNetworkConnection;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.mysql.jdbc.StatementInterceptor;

/**
 * 
 * @author Boussaid
 *
 */
public class MysClass {

	private String mm;

	private int b;

	private String news;

	private int countxcx;
	
	private int boumadien;
	
	/**
	 * Method permet de faire ....
	 * 
	 * @return boolean si égale à 50
	 */
	public static  boolean verifierCode( ) {
		
		int i=100 ;
		
		for (int j = 0; j < i; j++) {
			if(j==50 ) {
				System.out.print("merci");
				return true;
			}
		}
		
		
		return false;
	}
	public static void main (String[] arg ) throws IOException, InterruptedException, LdapException {
		AES aes = new AES();
		System.out.println("AdminMyia : " +aes.encrypt("AdminMyia", "aiymmyia"));
		System.out.println("x159x753! : " +aes.encrypt("AdminMyia:x159x753!", "aiymmyia"));
		System.out.println("gACGRpZl37neSUcm4Y4esw== : " +aes.decrypt("F0Psl2Vfg7tqWEmMY/+fBA==", "aiymmyia"));
	/*	HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .header("Authorization", "Basic F+Ujpo9zqvGsVLyHIKt9nedcRLNcN2D3IMcK1xjq52I=")
                .uri(URI.create("http://dev-ut.synchronecs.com/myia/rest/article/list"))
                .build();
		
		 HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		 ObjectMapper mapper = new ObjectMapper();
	        List<String> posts = mapper.readValue(response.body(), new TypeReference<List<String>>() {});

	        // posts.forEach(post -> {
	        //     System.out.println(post.toString());
	        // });
	        posts.forEach(System.out::println);
	        JsonObject res = new JsonObject(response);
	}
	 private final CloseableHttpClient httpClient = HttpClients.createDefault();
		public void parse() {
			
	HttpGet request = new HttpGet("http://dev-ut.synchronecs.com/myia/rest/article/list");
	request.addHeader("Authorization", "Basic F+Ujpo9zqvGsVLyHIKt9nedcRLNcN2D3IMcK1xjq52I=");
	try (CloseableHttpResponse response = httpClient.execute(request)) {

	    // Get HttpResponse Status
	    System.out.println(response.getStatusLine().toString());

	    HttpEntity entity = response.getEntity();
	    Header headers = entity.getContentType();
	    Header[] h = response.getAllHeaders();

	    BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		StringBuffer result = new StringBuffer();
		String line;
		while ((line = rd.readLine()) != null) {
			result.append(line);
			
		}
		JsonObject res = new JsonObject(line);	
		System.out.println(jsonObject.toString());
		
	}*/
		
		final LdapConnection lLdapConnection = new LdapNetworkConnection("test-clu01.synchronecs.com", 10389);
		
		/*  try {
				lLdapConnection.bind("uid=admin,ou=system", "MyPa$$word01%");
			

		        lLdapConnection.add( 
		                new DefaultEntry( 
		                    "uid=test,ou=users,dc=uxelio,dc=com",    // Distinguished Name
		                    "ObjectClass: top",
		                    "objectClass: inetOrgPerson",
		                    "ObjectClass: person",
		                    "objectClass: organizationalPerson",
		                    "cn: test",
		                    "sn: surnom",
		                    "mail:test@gmail.com",
		                    "userPassword:test"
		                    
		                    ));

		        lLdapConnection.unBind();
		        lLdapConnection.close();
			 } catch (LdapException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
	
		
	/*	try {
			lLdapConnection.bind("uid=admin,ou=system", "MyPa$$word01%");
		

        lLdapConnection.delete("uid=test,ou=users,dc=uxelio,dc=com");

        lLdapConnection.unBind();
        lLdapConnection.close();
        
		} catch (LdapException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
        lLdapConnection.bind("uid=admin,ou=system", "MyPa$$word01%");

        final EntryCursor lEntryCursor = lLdapConnection.search(
                                                    "ou=users,dc=uxelio,dc=com", 
                                                    "(objectclass=*)", 
                                                    SearchScope.ONELEVEL, 
                                                    "*");

        for (final Entry lEntry : lEntryCursor) {
            System.out.println(lEntry);
        }

        lLdapConnection.unBind();
        lLdapConnection.close();
		
        lLdapConnection.bind( "cn=boumadien,ou=users,dc=uxelio,dc=com", "1234" );
        if(lLdapConnection.isConnected())
        	System.out.println("ok");
       
        System.out.println( lLdapConnection.lookup("cn=boumadien,ou=users,dc=uxelio,dc=com"));
        lLdapConnection.unBind();
        lLdapConnection.close();
        
      
}}
