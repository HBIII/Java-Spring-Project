package springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourceCodeConstraintValidator 
	implements ConstraintValidator<CourceCode, String>{

	private String[] courcePrefix;
	
	@Override
	public void initialize(CourceCode theCourceCode) {
		
		courcePrefix=theCourceCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		Boolean result=true;
		
		if(theCode!=null)
		{
			for (String tempPrefix : courcePrefix) 
			{
            result = theCode.startsWith(tempPrefix);
            
            if (result)
                break;
			}
		}
		else
			return true;
		return result;
	}

}
