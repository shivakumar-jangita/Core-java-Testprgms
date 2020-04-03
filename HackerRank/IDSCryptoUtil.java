package HackerRank;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


/**
 * @author wipjallv
 *
 */
public class IDSCryptoUtil {
	
	 private static byte[] AES_KEY = {
	    	0x50, 0x26, 0x73, 0x7A, 0x2B, 0x21, 0x62, 0x54, 0x34, 0x24, 0x25, 0x5E, 0x37, 0x78, 0x73, 0x39
	    };
	    
	    //private static  String  		KEY = "P&sz+!bT4$%^7xs9";
	    private static  Cipher  		CIPHER = null;
	    private static  SecretKeySpec 	KEYSPEC = new SecretKeySpec(AES_KEY, "AES");
	    
	    static
	    {
	    	try 
	    	{
				CIPHER = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			    
			} 
	    	catch (Exception ex) 
	    	{
	    		ex.printStackTrace();
	    	}
	    }	

	    public static String encryptText(String parmUnEncryptedText)
	    {
	        try
	        {
	            CIPHER.init(Cipher.ENCRYPT_MODE, KEYSPEC);
	            byte[] encryptedBuffer= CIPHER.doFinal(parmUnEncryptedText.getBytes());
	            return new sun.misc.BASE64Encoder().encode(encryptedBuffer);
	        }
	        catch (Exception ex)
	        {
	        	ex.printStackTrace();
	        }
	        return null;

	    }

	    public static String decryptText(String parmEncryptedText)
	    {
	    	
	        try
	        {
	        	byte[] inputBuffer = new sun.misc.BASE64Decoder().decodeBuffer(parmEncryptedText);
	            CIPHER.init(Cipher.DECRYPT_MODE, KEYSPEC);
	            byte[] decryptedBuffer= CIPHER.doFinal(inputBuffer);
	            return new String(decryptedBuffer);
	        }
	        catch (Exception ex)
	        {
	        	ex.printStackTrace();
	        }
	        return null;
	    }

	    
	    public static void main(String...sd)
	    {
	    	String str="IDS_SUB_INT_EDU_SERV";
	    	String ss="tK9wMPTrsXfOANyHqwE2bv5DTPRhBKv4CHQDG1JwE9E=";
	    	encryptText(str);
	    	decryptText(ss);
	    	System.out.println("Encrypt Key-->"+encryptText(str));
	    	System.out.println("Decrept Key-->"+decryptText(ss));
	    }
}
