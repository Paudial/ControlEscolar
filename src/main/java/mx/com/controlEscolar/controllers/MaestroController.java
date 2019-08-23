package mx.com.controlEscolar.controllers;

import java.util.List;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mx.com.controlEscolar.dao.MaestroDAO;
import mx.com.controlEscolar.models.Maestro;
import mx.com.controlEscolar.models.PaginationFormCriteria;

@Controller
public class MaestroController {

	private static final Logger logger = LoggerFactory
			.getLogger(MaestroController.class);
	
	@Autowired
	private MaestroDAO maestroDAO;
	
	@RequestMapping(method = RequestMethod.GET, value = { "/", "/maestros" })
	public String showMaestros(Map<String, Object> model) {
		logger.info("Maestro showMaestros. ");
		
//		Maestro emptyMaestro = new Maestro();
//		model.put("emptyMaestro", emptyMaestro);
		
		List<Maestro> maestros = maestroDAO.selectAll(Maestro.class);
		model.put("maestros", maestros);

		return "maestro/maestros";
	}
	
	@RequestMapping (method = RequestMethod.GET, value = { "/maestros/{id}" })
	public String maestroDetail (@PathVariable(value = "id") Integer id, Map <String, Object> model) {
		logger.info("Maestro detail");
		
		Maestro maestro = (Maestro) maestroDAO.selectById(id,Maestro.class);
		model.put("maestro", maestro);
		
		return "maestro/maestroDetail";
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = { "/maestros/new" })
	public String newMaestro (Map<String, Object> model) {
		logger.info("Showing custom view GET ");
		
		model.put("maestro", new Maestro());
		
		return "maestro/newMaestro";
	}
	
	@RequestMapping(value = "/maestros/new", method = RequestMethod.POST)
	public ModelAndView createMaestro(Maestro maestro) {
		logger.info("Saveview POST " + maestro.getIdMaestro());
		
		ModelAndView modelAndView = new ModelAndView();
		
		maestroDAO.insert(maestro);
		
		modelAndView.setViewName("maestro/created");
		
		return modelAndView;
		
	}
	
	@RequestMapping(value = "/maestros/update/{id}", method = RequestMethod.GET)
	public String update(@PathVariable(value = "id") Integer id, Model model) {
		logger.info("Showing update view GET ");
		
		model.addAttribute("maestro",maestroDAO.selectById(id, Maestro.class));
		
		return "maestro/update";
	}
	
	@RequestMapping(value = "/maestros/saveUpdate", method = RequestMethod.POST)
	public ModelAndView saveUpdate (Maestro maestro) {
		logger.info("Save update " + maestro.getIdMaestro());
		
		maestroDAO.update(maestro);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("maestro", maestro);
		modelAndView.setViewName("maestro/saveUpdated");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "maestros/delete/{id}", method =  RequestMethod.GET)
	public String delete(@PathVariable(value = "id") Integer maestroId, Model model) {
		logger.info("Maestro detail /delete");
		
		maestroDAO.delete(maestroDAO.selectById(maestroId, Maestro.class));
		model.addAttribute("maestroId", maestroId);
		
		return "maestro/deleted";
	}
	
}
