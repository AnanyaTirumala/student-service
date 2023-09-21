package com.training.studentservice.controller;
import java.util.List;

@RestController			//combination of @Controller+@ResponseBody
@RequestMapping("/studapi")
public class StudentController {
	
	@Autowired
	StudentRepository repository;
	
	@GetMapping("/stud")
//	@ResponseBody
	public List<Student> getStudent() {
		
//		List<Student> studList = new ArrayList<>();
//		studList.add(new Student("Raj", 21, "A+"));
//		studList.add(new Student("Aman", 22, "A"));
//		studList.add(new Student("Priya", 21, "A+"));
//		studList.add(new Student("Sara", 22, "A"));
//		return studList;
		
		return repository.findAll();
		
	}
	
	@PostMapping("/post")
	public void post(@RequestBody Student stud) {
		repository.save(stud);
	}
	
	@GetMapping("/stud/{id}")
	public Student getStudentById(@PathVariable("id") long id) {
		
		Optional<Student> stud = repository.findById(id);
		
		if(stud.isPresent()) {
			return stud.get();
		} else {
			return null;
		}
				
	}

}