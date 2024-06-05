import './App.css';

import WheelComponent from "react-wheel-of-prizes"
import { segColors, game_data, searchUrlByTitle} from './data';

import 'bootstrap/dist/css/bootstrap.css';
import { useState } from 'react';

function App() {

  let [segments, setSegments] = useState(game_data.level)
  let [key, setkey] = useState(0);
  let [level, setLevel] = useState(game_data.level[0])
  let [prob, setProb] = useState(game_data.Easy[0].title)
  let [next, IsNext] = useState(false)

  const onFinished = (winner) => {

    if(next) {
      setProb(winner)
    }else{
      setLevel(winner)
    }
  }

  const onReset = () => {
    setSegments(game_data.level)
    IsNext(false)
    setkey((i) => i + 1)
  }

  const onNext = () => {
    setSegments(game_data[level].map((value, index) => value.title))
    IsNext(true);
    setkey((i) => i + 1);
  }

  const onOpen = () => {
    if(next){
      window.open( searchUrlByTitle(level, prob) ,"_blank")
    }
  }

  return (
    <div className="App">
      <div className='row frame'>
        <div className='col-2 '></div>
        <div className="col-8 middle-div">

          <div className='main row'>

              <div className='spin col-8'>
                <div className='spin-wheel'>
                    <WheelComponent
                        key={key}
                        className="spin-Component"
                        segments={segments}
                        segColors={segColors}
                        onFinished={(winner) => onFinished(winner)}
                        primaryColor='#463F9E'
                        contrastColor='white'
                        buttonText='Spin'
                        isOnlyOnce={false}
                        size={200}
                        upDuration={100}
                        downDuration={1500}
                        fontFamily='Arial'
                    /> 
                  </div>
              </div>
              <div className='col-4 left-div'>
              <div className='left-div'>
                  <div className='logo row'>
                          <div>
                              <img src="/ITSCAPE.png" alt=""/>
                          </div>
                      </div>

                      <div className='row p-1 m-1'>
                          <button className='mb-3 common-btn next-btn' onClick={onNext}>
                              Next
                          </button>

                          <button className='mb-3 common-btn reset-btn' onClick={onReset}>
                              Reset
                          </button>

                          <button className='common-btn open-btn' onClick={onOpen}>
                              open
                          </button>
                      </div>
                  </div>
              </div>
          </div>
        </div>
        <div className="col-2"></div>
      </div>
    </div>
  );
}

export default App;
