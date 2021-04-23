package com.demo.junit.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ValidationUtil {

	private ValidationUtil() {}
	
	   public static boolean isValidFirstName(String firstname) {

               final  String pattern1="^[A-Z]{1}[A-Z a-z]{2,}$";
               final  Pattern =Pattern.compile(pattern1);
               final  Matcher =pattern.matcher(firstname);
                 return matcher.matches();
           }

	    public static boolean isValidLastName(String lastname) {

	        final String pattern2="^[A-Z]{1}[A-Z a-z]{2,}$";
	        final  Pattern =Pattern.compile(pattern2);
	        final Matcher =pattern.matcher(lastname);
	         return matcher.matches();
	    }

	     public static boolean isValidEmailID(String emailId) {

	    	  final String pattern3="^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";
	    	  final Pattern =Pattern.compile(pattern3);
	    	  final  Matcher =pattern.matcher(emailId);
	    	    return matcher.matches();
	     }


	     public static boolean isValidMobile(String Mobile) {

		  final String pattern4="^[+][0-9]{1,}\\s?[1-9]{1}[0-9]{9}$";
		  final  Pattern =Pattern.compile(pattern4);
		  final  Matcher =pattern.matcher(Mobile);
		    return matcher.matches();
	      }

	     public static boolean isValidPassword(String password) {

	         final String pattern5="^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$";
	         final  Pattern =Pattern.compile(pattern5);
	    	 final  Matcher =pattern.matcher(password);
	           return matcher.matches();
	     }
}

package com.demo.junit;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.demo.junit.utils.ValidationUtil;

  public class ValidationUtilTest {
	
	@Test
	public void testFirstName_shouldReturnTrue() {
	    String firstName="Himanshu";
		boolean result=ValidationUtil.isValidIname(firstName);
		assertTrue(result);
        }
	
	@Test
	public void testFirstName_shouldReturnFalse() {
	    String firstName="kaushik06";
		boolean result=ValidationUtil.isValidIname(firstName);
		assertFalse(result);
       }
	
	@Test
	public void testFirstName_shouldReturnFalse() {
	    String firstName="NaRenDra@";
		boolean result=ValidationUtil.isValidIname(firstName);
		assertFalse(result);
       }
	
	@Test
	public void testLastName_shouldReturnTrue() {
	    String lastName="Kaushik";
		boolean result=ValidationUtil.isValidIIname(lastName);
		assertTrue(result);
       }
	
	@Test
	public void testLastName_shouldReturnFalse() {
	    String lastName="@MoDi";
		boolean result=ValidationUtil.isValidIIname(lastName);
 		assertFalse(result);
       }
 	
	@Test
	public void testLastName_shouldReturnFalse() {
	    String lastName="aDiTYA";
		boolean result=ValidationUtil.isValidIIname(lastName);
		assertFalse(result);
       }
	
	@Test
	public void testEmailId_shouldReturnTrue() {
	    String emailId="1206.mishra@gmail.com";
		boolean result=ValidationUtil.isValidEmailID(emailId);
		assertTrue(result);
        }
	
	@Test
	public void testEmailId_shouldReturnFalse() {
	    String emailId="123@xyz@.co.in";
		boolean result=ValidationUtil.isValidEmailID(emailId);
		assertFalse(result);
        }
	
	@Test
	public void testEmailId_shouldReturnFalse() {
	    String emailId="@abc$#bridgelabz.com";
		boolean result=ValidationUtil.isValidEmailID(emailId);
		assertFalse(result);
       }
	
	@Test
	public void testMobile_shouldReturnTrue() {
	    String Mobile="+91 9987864657";
		boolean result=ValidationUtil.isValidMobile(Mobile);
		assertTrue(result);
        }
	
	@Test
	public void testMobile_shouldReturnFalse() {
	    String Mobile="011 99878675439";
		boolean result=ValidationUtil.isValidMobile(Mobile);
		assertFalse(result);
        }
	
	@Test
	public void testMobile_shouldReturnFalse() {
	    String Mobile="+111 996866565A";
		boolean result=ValidationUtil.isValidMobile(Mobile);
		assertFalse(result);
        }
	
	@Test
	public void testPassword_shouldReturnTrue() {
	    String password="abrakadabra@_12";
		boolean result=ValidationUtil.isValidPassword(password);
		assertTrue(result);
        }
	
	@Test
	public void testPassword_shouldReturnTrue() {
	    String password="xxxxy_@1098";
		boolean result=ValidationUtil.isValidPassword(password);
		assertFalse(result);
        }
	
	@Test
	public void testPassword_shouldReturnTrue() {
	    String password="XYZ@123WS";
		boolean result=ValidationUtil.isValidPassword(password);
		assertFalse(result);
        }
  }