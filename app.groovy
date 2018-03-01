import org.springframework.beans.factory.annotation.Autowired

import src.main.groovy.ScenarioManager

@Controller class FrontendApp { }

@RestController
class ScenariosController {
	 
	 @Autowired private ScenarioManager scenarioManager

	 
    @RequestMapping("/list-scenarios")
    String listScenarios() {
        return scenarioManager.getList();
    }

}