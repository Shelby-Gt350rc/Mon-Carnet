/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelby.carnet.security;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author Patrick-Noah
 */
public class HexEncode {
static class BadInputStringException extends Exception {
		public BadInputStringException(String arg0) {
			super(arg0);
		}
	}
	private String texte;
        private String hex;
        private String ascii;
	private static String ENCODING = "utf-8";
 
	static private final char[] HEX_DIGITS = new char[] {
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
	};
	static private char intToHexDigit(int b) {
		assert b>=0 && b<16;
		return HEX_DIGITS[b];
	}
	static private int hexDigitToInt(char hexDigit) throws BadInputStringException {
		if (hexDigit>='0' && hexDigit<='9')
			return (int)(hexDigit - '0');
		if (hexDigit>='a' && hexDigit<='f')
			return (int)(hexDigit - 'a' + 10);
		if (hexDigit>='A' && hexDigit<='F')
			return (int)(hexDigit - 'A' + 10);
		throw new BadInputStringException("Invaid hex digit: " + hexDigit);
	}
 
	public String asciiToHex(String ascii) throws UnsupportedEncodingException, BadInputStringException {
		byte[] encoded = ascii.getBytes(ENCODING);
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<encoded.length; i++) {
			byte b = encoded[i]; 
			sb.append(intToHexDigit((b >> 4) & 0xF));
			sb.append(intToHexDigit(b & 0xF));
		}
		return sb.toString();
	}
 
	private String hextoAscii(String hex) throws UnsupportedEncodingException, BadInputStringException {
		if (0 != (hex.length() & 1))
			throw new BadInputStringException("sms d'erreur sur la porte du code hexa!");
		int encoded_len = hex.length() / 2;
		byte[] encoded = new byte[encoded_len];
 
		for (int i=0; i<encoded_len; i++) {
			encoded[i] = (byte)((hexDigitToInt(hex.charAt(i*2)) << 4) | hexDigitToInt(hex.charAt(i*2+1))); 
		}
		return new String(encoded, ENCODING);
	}
	
	public String runHexaCode(String texte) {
            
		try {
			String hex = asciiToHex(texte);
			String ascii = hextoAscii(hex);
                        this.hex=hex; //tranformation en hexa
                        this.ascii=ascii;//transformation ascii
		} catch (Exception ex) {
		} 
                return hex;
	}
        public String runAsciiCode(String texte) {
            
		try {
			String hexa = asciiToHex(texte);
			String ascii = hextoAscii(hexa);
                        this.hex=hexa; //tranformation en hexa
                        this.ascii=ascii;//transformation ascii
		} catch (Exception ex) {
		} 
                return ascii;
	}
         
        
        
	
//	public static void main(String[] args) {
//		new HexEncode().run();
//	}

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getAscii() {
        return ascii;
    }

    public void setAscii(String ascii) {
        this.ascii = ascii;
    }
    
}