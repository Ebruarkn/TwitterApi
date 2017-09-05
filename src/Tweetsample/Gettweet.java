package Tweetsample;



import twitter4j.DirectMessage;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Gettweet {

	public static void main(String[] args) throws TwitterException{
		// TODO Auto-generated method stub

		
	ConfigurationBuilder test= new ConfigurationBuilder();
	
	test.setDebugEnabled(true)
		.setOAuthConsumerKey("hF5Qd1G7UZaAa8BiFDipKS0bs")
		.setOAuthConsumerSecret("yizXXSBhiSqPI6Zmpkxx3zdheDPwf4xuQlCs3vpuTujHJlJOhv")
		.setOAuthAccessToken("863091608-4dEHUG7aNns2Cz5OpJfcs4hc72N4S5ofgdqBGXt0")
		.setOAuthAccessTokenSecret("nmBkiBXoPjOxfmlwcevcYm9t1HBZFIOFfAAa4OqJ5eVrd");
		
		
	
	TwitterFactory fac=new TwitterFactory(test.build());
	twitter4j.Twitter take= fac.getInstance();
	ResponseList<Status> durum = take.getFavorites();
	System.out.println(durum.size());
	for(Status stadus:durum) {	
		System.out.println(stadus.getText()+"          "+stadus.getCreatedAt());
	
	}
	}

}

