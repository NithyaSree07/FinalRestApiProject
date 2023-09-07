import React from 'react'
import Navbar from '../components/Navbar';
import Hero2 from '../components/Hero2';
import Footer from '../components/Footer';
import AboutUs from '../components/AboutUs';


export const About = () => {
  return (
    <div>
    <Navbar/>
    <Hero2 heading="About Us!" />
    <AboutUs/>
    <Footer/>
    </div>
  )
}
export default About;