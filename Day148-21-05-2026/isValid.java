class Solution {
	public boolean isValid(String s) {
		// code here
		String[] ip = s.split("\\.");
		if (ip.length >4) {
			return false ;
		}
		if (ip.length == 4) {
			for (String sp : ip) {
			    if(sp.length()>=2 && sp.charAt(0)== '0'){
			        return false;
			    }
				if (sp.equals("")) {
					return false;
				}
				if (sp.length()>3) {
					return false;
				}
				int value = Integer.parseInt(sp);
				if (value >255) {
					return false;
				} else if (value<0) {
					return false;
				}
			}
			
		} else {
			return false;
		}
		
		return true;
	}
}
