import  Navbar  from '../components/Navbar';
import Footer from '../components/Footer';
import React from 'react'
import Hero2 from '../components/Hero2';
import Items from '../components/Items';




const Products = () => {
  return (
    <div>
    <Navbar/>
    <Hero2  heading="PRODUCTS." text="Food Hood "/>
    <Items/>
    <Footer/>
    </div>
  )
}
export default Products