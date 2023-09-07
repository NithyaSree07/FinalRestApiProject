import "./HeroImgStyles.css";
import background from "../assets/background.jpg";
import { Link } from "react-router-dom";
import React from 'react'

const HeroImg = () => {
  return (
    <div className="hero">
    <div className="mask">
    <img className="background-img" src={background} alt="Introimage"/>
    </div>
<div className="content">

<p>Welcome to Gfresh Shopping !!</p>
<br></br>
<br></br>

<Link to="/product" className="btn">Products</Link>
<Link to="/contact" className="btn btn-light">Contact</Link>
</div>
</div>
    
  )
}
export default HeroImg;