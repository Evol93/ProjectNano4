package server.gachapon;

/**
*
* @author Alan (SharpAceX)
*/

public class Henesys extends GachaponItems {

	@Override
	public int[] getCommonItems() {
		return new int [] {
				/* Common Eqps */	1432009, 1302022, 1322027, 1062000, 1002033, 1092022, 1302021, 1322009, 1002012, 1322012,
				/* Warrior Eqps */	1312007, 1002093, 1051016, 1040030, 1060009, 1060000, 1082025, 1402002, 1092000, 1072041, 
				/* Mage Equips */	1051023, 1002035, 1061028, 1040019, 1002152, 1002155, 1041018, 1050031, 1002102, 1082028,
				/* Bowman Equips */	1002010, 1002057, 1002112, 1002113, 1002114, 1002115, 1002116, 1002117, 1002118, 1002119,
									1002120, 1002121, 1002135, 1002136, 1002137, 1002138, 1002139, 1002156, 1002157, 1002158,
									1002159, 1002160, 1002161, 1002162, 1002163, 1002164, 1002165, 1002166, 1002167, 1002168,
									1002169, 1002170, 1002211, 1002212, 1002213, 1002214, 1002267, 1002268, 1002269, 1002270,
									1002275, 1002276, 1002277, 1002278, 1002286, 1002287, 1002288, 1002289, 1002402, 1002403,
									1002404, 1002405, 1002406, 1002407, 1002408, 1002580, 1002749
		};
	}

	@Override
	public int[] getUncommonItems() {
		return new int[] {
				/* 110 Equips */	1002547
		};
	}

	@Override
	public int[] getRareItems() {
		return new int[] {
				/* Reverse Eqps */	1002792, 
									1462052, 1462053, 1462054, 1462055,
		};
	}

}