public class PMDCheck {
	public void pmdValidate() throws Exception {
		String s = null;
		try {
			s="Welcome Sample PMD Custom rule";
			System.out.println(s);
		} catch (Exception e) {
			throw new Exception("Exception in PMDCheck.pmdValidate"+e);		
		}
	}
}