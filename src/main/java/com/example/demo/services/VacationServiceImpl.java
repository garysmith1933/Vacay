
public class VacationServiceImpl implements VacationService {

  @Autowired
  private VacationRepository vacationRepository;

  @Override
  public List<Vacation> fetch_vacations() {
    return this.vacationRepository.findAll();
  }
}