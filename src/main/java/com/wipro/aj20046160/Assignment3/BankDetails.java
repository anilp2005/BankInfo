package com.wipro.aj20046160.Assignment3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BankDetails {
	@RequestMapping("/bankbranches")
	public String bankBranches() {
		return "bankbranches";
	}
	@RequestMapping("/bankservices")
	public String bankServices() {
		return "bankservices";
	}

}
