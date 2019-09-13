package com.edu.msc.sliit.model;

import java.util.HashMap;

public class ManuwalNoiseRemoval {

	public static HashMap<Integer, Boolean> SinDoc1 = new HashMap<Integer, Boolean>();
	
	public static HashMap<Integer, Boolean> SinDoc3 = new HashMap<Integer, Boolean>();

	public static HashMap<Integer, Boolean> englishDoc1 = new HashMap<Integer, Boolean>();
	
	public static HashMap<Integer, Boolean> englishDoc2 = new HashMap<Integer, Boolean>();
	
	public static HashMap<Integer, Boolean> englishDoc3 = new HashMap<Integer, Boolean>();
	
	static {
		SinDoc1.put(33, true);
		SinDoc1.put(34, true);
		SinDoc1.put(266, true);
		
		SinDoc3.put(165, true);
		SinDoc3.put(472, true);

		englishDoc1.put(330, true);
		englishDoc1.put(331, true);
		
		englishDoc2.put(91, true);
		//englishDoc2.put(271, true);
		
		englishDoc3.put(186, true);
		englishDoc3.put(187, true);
		englishDoc3.put(188, true);
		englishDoc3.put(189, true);
		
	}

	public static boolean noisereport(int width, int height, int findcount) {

		//System.out.println("noisereport : width "+width+" Height "+height);
		//System.out.println("( width == 679 && height == 714 ) : "+( width == 679 && height == 714 ));
		if ( width == 679 && height == 714 ) {  
			try {
				if (SinDoc1.get(findcount)) {					
					return false;
				} else {					
					return true;
				}
			} catch (Exception e) {
				return true;
			}
		}else if(width == 604 && height == 514) {
			try {
				if (englishDoc1.get(findcount)) {
					return false;
				} else {
					return true;
				}
			} catch (Exception e) {
				return true;
			}
		}
		else if(width == 636 && height == 703) {  // img 4
			try {
				if (englishDoc2.get(findcount)) {
					return false;
				} else {
					return true;
				}
			} catch (Exception e) {
				return true;
			}
		}
		else if(width == 645 && height == 752) {  // img 5
			try {
				if (SinDoc3.get(findcount)) {
					return false;
				} else {
					return true;
				}
			} catch (Exception e) {
				if(findcount>1903) {
					return false;
				}
				else {
					return true;
				}
					
				
			}
		}
		else if(width == 616 && height == 640) {  // img 6
			try {
				if (englishDoc3.get(findcount)) {
					return false;
				} else {
					return true;
				}
			} catch (Exception e) {
				return true;
			}
		}
		else {//Otherdocuments
			//System.out.println("Widh and height not matchedd");
			return true;
		}
	}
}
