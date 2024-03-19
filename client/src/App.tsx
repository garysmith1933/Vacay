import './App.css'
import Mexico from './assets/vacation-images/mexico.jpg'


const App: React.FC = () => { // List of all vacation locations -> excursion for single vacation
  return (
    <>
      <div>
        <h1> Hello World </h1>
      </div>

      <div id='mexico'>
        <img id='mexico-image' src={Mexico}/>
        <h2>Mexico</h2>
      </div>
      
    </>
  )
}

export default App
