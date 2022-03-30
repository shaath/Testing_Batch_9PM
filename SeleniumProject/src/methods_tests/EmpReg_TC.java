package methods_tests;

import java.io.IOException;

import methods.BusinessMethods;

public class EmpReg_TC {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res = null;
		BusinessMethods bm = new BusinessMethods();
			
		res = bm.Org_Launch("firefox", "https://opensource-demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res = bm.Org_Login("Admin", "admin123");
		System.out.println("Application Login "+res);
		
		res = bm.Org_EmpReg("Siva", "P", "SP1234");
		System.out.println("Employee Registration "+res);
		
		res = bm.Org_Logout();
		System.out.println("Application Logout "+res);
		
		bm.Org_Close();
		System.out.println("Browser Closed Successfully");	


	}

}
