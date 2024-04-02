
@RestController
@RequestMapping("api/vacations")
public class VacationController {

  @Autowired
  private VacatiionService vacationService; //need to import later
  
  public List<Vacation> fetch_vacations() {
    return vacationService.fetch_vacations();
  }
}