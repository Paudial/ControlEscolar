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

import mx.com.controlEscolar.dao.MateriaDAO;
import mx.com.controlEscolar.models.Materia;

@Controller
public class MateriaController {

	private static final Logger logger = LoggerFactory
			.getLogger(Materia.class);
	
	@Autowired
	private MateriaDAO materiaDAO;
	
	@RequestMapping(method = RequestMethod.GET, value = {"/materias"})
	public String showMaterias(Map<String,Object> model) {
		logger.info("Materia showMaterias");
		
		List<Materia> materias = materiaDAO.selectAll(Materia.class);
		model.put("materias", materias);
		
		return "materia/materias";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/materias/{id}"})
	public String materiaDetail (@PathVariable(value = "id") Integer id, Map <String, Object> model) {
		logger.info("Materia detail");
		
		Materia materia = (Materia) materiaDAO.selectById(id, Materia.class);
		model.put("materia", materia);
		
		return "materia/materiaDetail";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/materias/new"})
	public String newMateria (Map<String, Object> model) {
		logger.info("Showing custom view GET");
		
		model.put("materia", new Materia());
		
		return "materia/newMateria";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = {"/materias/new"})
	public ModelAndView createdAlumno(Materia materia) {
		logger.info("Saveview POST " + materia.getIdMateria());
		
		ModelAndView modelAndView = new ModelAndView();
		
		materiaDAO.insert(materia);
		
		modelAndView.setViewName("materia/created");
		
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"materias/update/{id}"})
	public String update(@PathVariable(value = "id")Integer id, Model model) {
		logger.info("Showing update view GET");
		
		model.addAttribute("materia", materiaDAO.selectById(id, Materia.class));
		
		return "materia/update";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = {"/materias/saveUpdate"})
	public ModelAndView saveUpdate(Materia materia) {
		logger.info("Save update " + materia.getIdMateria());
		
		materiaDAO.update(materia);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("materia",materia);
		modelAndView.setViewName("materia/saveUpdated");
		
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"materias/delete/{id}"})
	public String delete(@PathVariable(value = "id") Integer materiaId, Model model) {
		logger.info("Materia detail/delete");
		
		materiaDAO.delete(materiaDAO.selectById(materiaId, Materia.class));
		model.addAttribute("materiaId",materiaId);
		
		return "materia/deleted";
	}
}
