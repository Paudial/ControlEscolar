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

import mx.com.controlEscolar.dao.AlumnoDAO;
import mx.com.controlEscolar.models.Alumno;

@Controller
public class AlumnoController {

	private static final Logger logger = LoggerFactory
			.getLogger(AlumnoController.class); 
	
	@Autowired
	private AlumnoDAO alumnoDAO;
	
	@RequestMapping(method = RequestMethod.GET, value = {"/alumnos"})
	public String showAlumnos(Map<String,Object> model) {
		logger.info("Alumnos showAlumnos");
		
		List<Alumno> alumnos = alumnoDAO.selectAll(Alumno.class);
		model.put("alumnos", alumnos);
		
		return "alumno/alumnos";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/alumnos/{id}"})
	public String alumnoDetail (@PathVariable(value = "id") Integer id, Map <String, Object> model) {
		logger.info("Alumno detail");
		
		Alumno alumno = (Alumno) alumnoDAO.selectById(id, Alumno.class);
		model.put("alumno", alumno);
		
		return "alumno/alumnoDetail";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"/alumnos/new"})
	public String newAlumno (Map<String, Object> model) {
		logger.info("Showing custom view GET");
		
		model.put("alumno", new Alumno());
		
		return "alumno/newAlumno";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = {"/alumnos/new"})
	public ModelAndView createdAlumno(Alumno alumno) {
		logger.info("Saveview POST " + alumno.getIdAlumno());
		
		ModelAndView modelAndView = new ModelAndView();
		
		alumnoDAO.insert(alumno);
		
		modelAndView.setViewName("alumno/created");
		
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"alumnos/update/{id}"})
	public String update(@PathVariable(value = "id")Integer id, Model model) {
		logger.info("Showing update view GET");
		
		model.addAttribute("alumno", alumnoDAO.selectById(id, Alumno.class));
		
		return "alumno/update";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = {"/alumnos/saveUpdate"})
	public ModelAndView saveUpdate(Alumno alumno) {
		logger.info("Save update " + alumno.getIdAlumno());
		
		alumnoDAO.update(alumno);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("alumno",alumno);
		modelAndView.setViewName("alumno/saveUpdated");
		
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = {"alumnos/delete/{id}"})
	public String delete(@PathVariable(value = "id") Integer alumnoId, Model model) {
		logger.info("Alumno detail/delete");
		
		alumnoDAO.delete(alumnoDAO.selectById(alumnoId, Alumno.class));
		model.addAttribute("alumnoId",alumnoId);
		
		return "alumno/deleted";
	}
}
