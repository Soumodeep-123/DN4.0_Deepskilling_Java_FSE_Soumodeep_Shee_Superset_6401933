import logo from './logo.svg';
import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div className='Container'>
      <CalculateScore Name={"Steve"}
      School = {"DNV Public School"}
      total = {284}
      goal={3}
      />
    </div>
  );
}

export default App;
