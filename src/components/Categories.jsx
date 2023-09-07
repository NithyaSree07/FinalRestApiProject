import React from 'react';
import './Categories.css';
import vegetables from "../assets/vegetables.png";
import fruits from "../assets/fruits.jpg";
import dairy from "../assets/dairy.jpg";
import meat from "../assets/meat.jpg";


export default function Categories() {
  return (
    <section className="categories" id="categories">
      <h1 className="heading">
        products
        {' '}
        <span>categories</span>
      </h1>
      <div className="box-container">
        <div className="box">
          <img src={vegetables} alt="" />
          <h3>vegetables</h3>
          <p>upto 45% off</p>
          <button type="button" className="btn">shop now</button>
        </div>

        <div className="box">
          <img src={fruits} alt="" />
          <h3>fresh fruits</h3>
          <p>upto 45% off</p>
          <button type="button" className="btn">shop now</button>
        </div>

        <div className="box">
          <img src={dairy} alt="" />
          <h3>dairy products</h3>
          <p>upto 45% off</p>
          <button type="button" className="btn">shop now</button>
        </div>

        <div className="box">
          <img src={meat} alt="" />
          <h3>freshh meat</h3>
          <p>upto 45% off</p>
          <button type="button" className="btn">shop now</button>
        </div>
      </div>
    </section>
  );
}