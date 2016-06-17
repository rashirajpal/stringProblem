package com.apple;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author RashiRajpal
 */
public class StringProblemTest {
	@Test (dataProvider = "provider")
	public void testRemoveChar(String str, char charRemove,
	                           String expected) throws Exception {

		Assert.assertEquals(StringProblem.removeChar(str, charRemove), expected);
	}

	@Test (dataProvider = "provider")
	public void testRemoveCharOneLine(String str, char charRemove,
	                                  String expected) throws Exception {
		Assert.assertEquals(StringProblem.removeCharOneLine(str, charRemove), expected);
	}

	@DataProvider(name="provider")
	public Object[][] dataProvider (){
		return new Object[][] {
				{ "This is special string", ' ', "Thisisspecialstring" },
				{ "special", 'i', "specal" },
				{ "trigger", 'g', "trier" },
				{ null, 'x', null },
				{ "", 'x', "" },
				{ "&234", '&', "234" },
				{ "&234", '2', "&34" },
		};
	}
}