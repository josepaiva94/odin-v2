package pt.up.fc.dcc.odin.frontend.cucumber.stepdefs;

import pt.up.fc.dcc.odin.frontend.FrontendApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = FrontendApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
