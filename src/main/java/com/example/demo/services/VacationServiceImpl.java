
public class VacationServiceImpl implements VacatiionService {

  @Autowired
  private VacationRepository vacationRepository;

  @Override
  public List<Vacation> fetch_vacations() {
    return this.vacationRepository.findAll();
  }
}