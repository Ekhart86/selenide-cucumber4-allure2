package steps;

import org.springframework.beans.factory.annotation.Autowired;
import springbootcucumber.pages.LoginPage;

/**
 * A set of pages to be used in tests
 **/
public class PageSet {
    @Autowired
    LoginPage loginPage;
}
