package mbapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileCtrl {

	@Autowired
	MobileService mobileService;
	
	@RequestMapping(method=RequestMethod.GET,value="/getmobile")
	public List<Mobile> getMobiles()
	{
		return mobileService.getMobiles();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/getmobile/{imeiNo}")
	public Mobile getMobile(@PathVariable String imeiNo)
	{
		return mobileService.getMobile(imeiNo);
	}
}
