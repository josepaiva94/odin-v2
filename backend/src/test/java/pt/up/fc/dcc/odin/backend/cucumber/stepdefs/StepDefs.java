package pt.up.fc.dcc.odin.backend.cucumber.stepdefs;

import pt.up.fc.dcc.odin.backend.BackendApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = BackendApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
