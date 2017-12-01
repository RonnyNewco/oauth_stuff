package no.ronny.oauth.helpers;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String String1="{\n" + 
				"  \"emailAddress\": \"rkh@dnb.no\",\n" + 
				"  \"firstName\": \"Ronny\",\n" + 
				"  \"lastName\": \"Khan\",\n" + 
				"  \"positions\": {\n" + 
				"    \"_total\": 4,\n" + 
				"    \"values\": [\n" + 
				"      {\n" + 
				"        \"company\": {\"name\": \"Digital identification AS\"},\n" + 
				"        \"id\": 1094119934,\n" + 
				"        \"isCurrent\": true,\n" + 
				"        \"location\": {\n" + 
				"          \"country\": {\n" + 
				"            \"code\": \"no\",\n" + 
				"            \"name\": \"Norway\"\n" + 
				"          },\n" + 
				"          \"name\": \"Oslo Area, Norway\"\n" + 
				"        },\n" + 
				"        \"startDate\": {\n" + 
				"          \"month\": 6,\n" + 
				"          \"year\": 2017\n" + 
				"        },\n" + 
				"        \"summary\": \"Wholly owned subsidiary of DNB. Building the platform and solutions from scratch. Lean and mean without any permanent staff. Multi geographic team doing the implementation all cloud taken all the way possible all coordinated by me. Seconded from DNB so still employed by DNB.\",\n" + 
				"        \"title\": \"CTO and CISO\"\n" + 
				"      },\n" + 
				"      {\n" + 
				"        \"company\": {\n" + 
				"          \"id\": 4461,\n" + 
				"          \"industry\": \"Финансовые услуги\",\n" + 
				"          \"name\": \"DNB\",\n" + 
				"          \"size\": \"10001+\",\n" + 
				"          \"ticker\": \"DNBNOR\",\n" + 
				"          \"type\": \"Public Company\"\n" + 
				"        },\n" + 
				"        \"id\": 772437395,\n" + 
				"        \"isCurrent\": true,\n" + 
				"        \"location\": {\n" + 
				"          \"country\": {\n" + 
				"            \"code\": \"no\",\n" + 
				"            \"name\": \"Norway\"\n" + 
				"          },\n" + 
				"          \"name\": \"Bergen Area, Norway\"\n" + 
				"        },\n" + 
				"        \"startDate\": {\n" + 
				"          \"month\": 2,\n" + 
				"          \"year\": 2016\n" + 
				"        },\n" + 
				"        \"summary\": \"Expert/specialist at the newly established unit for buisness development and digitalisation. \",\n" + 
				"        \"title\": \"Innovation Expert, Buisness Development and Digitalisation\"\n" + 
				"      },\n" + 
				"      {\n" + 
				"        \"company\": {\n" + 
				"          \"id\": 4461,\n" + 
				"          \"industry\": \"Финансовые услуги\",\n" + 
				"          \"name\": \"DNB\",\n" + 
				"          \"size\": \"10001+\",\n" + 
				"          \"ticker\": \"DNBNOR\",\n" + 
				"          \"type\": \"Public Company\"\n" + 
				"        },\n" + 
				"        \"id\": 422124813,\n" + 
				"        \"isCurrent\": true,\n" + 
				"        \"location\": {\n" + 
				"          \"country\": {\n" + 
				"            \"code\": \"no\",\n" + 
				"            \"name\": \"Norway\"\n" + 
				"          },\n" + 
				"          \"name\": \"Bergen Area, Norway\"\n" + 
				"        },\n" + 
				"        \"startDate\": {\n" + 
				"          \"month\": 10,\n" + 
				"          \"year\": 2005\n" + 
				"        },\n" + 
				"        \"summary\": \"Develop new security solutions for the Internet bank and mobile Solutions. Interface toward business development to develop suitable security solutions to serve business requirements.\\n\\nMaintain the day to day operations of authentication and authorization solutions. \\n\\nCombat and detect fraud in the electronic solutions. Interface toward several international vendors.\\n\\nCoordinate and translate business  requirements to development activities and managed the development activities.\\n\\nHighly involved in establishing mobile development competence generally and in establishing innovative security solutions for phone and tablets with the main focus on solving business requirements. Several of these implemented as solo projects to demonstrate feasibility and user convenience. \\n\\nFocus on business models and opertuneties which makes it possible to capatilize on mandatory investments in security for the financial sector. \\n\\nHas been presenter on several major international conferences on business opportunities with security as the catalytic element. Attendee on several other international security conferences.\",\n" + 
				"        \"title\": \"Product specialist\"\n" + 
				"      },\n" + 
				"      {\n" + 
				"        \"company\": {\n" + 
				"          \"id\": 4461,\n" + 
				"          \"industry\": \"Финансовые услуги\",\n" + 
				"          \"name\": \"DNB\",\n" + 
				"          \"size\": \"10001+\",\n" + 
				"          \"ticker\": \"DNBNOR\",\n" + 
				"          \"type\": \"Public Company\"\n" + 
				"        },\n" + 
				"        \"id\": 422128793,\n" + 
				"        \"isCurrent\": true,\n" + 
				"        \"location\": {\n" + 
				"          \"country\": {\n" + 
				"            \"code\": \"no\",\n" + 
				"            \"name\": \"Norway\"\n" + 
				"          },\n" + 
				"          \"name\": \"Bergen Area, Norway\"\n" + 
				"        },\n" + 
				"        \"startDate\": {\n" + 
				"          \"month\": 10,\n" + 
				"          \"year\": 2005\n" + 
				"        },\n" + 
				"        \"summary\": \"Responsible for maintenance and development of the technical solutions the Security Solution for all Electronic Services.(Internet banking, markets)\\nHeavily involved in  combating electronic fraud.\",\n" + 
				"        \"title\": \"Senior Product Architect/ Product Specialist\"\n" + 
				"      }\n" + 
				"    ]\n" + 
				"  }\n" + 
				"}";
		
		String str2="{\n" + 
				" \"id\": \"109669898516900357805\",\n" + 
				" \"email\": \"ronny@identification.no\",\n" + 
				" \"verified_email\": true,\n" + 
				" \"name\": \"Ronny Khan\",\n" + 
				" \"given_name\": \"Ronny\",\n" + 
				" \"family_name\": \"Khan\",\n" + 
				" \"picture\": \"https://lh3.googleusercontent.com/-XdUIqdMkCWA/AAAAAAAAAAI/AAAAAAAAAAA/4252rscbv5M/photo.jpg\",\n" + 
				" \"locale\": \"no\",\n" + 
				" \"hd\": \"identification.no\"\n" + 
				"}";
		
		JSONObject obj=new JSONObject(String1);
		String  mail=obj.getString("emailAddress");
		System.out.println(mail);
		JSONObject array=obj.getJSONObject("positions");
		System.out.println(array.toString());
		

	}

}
