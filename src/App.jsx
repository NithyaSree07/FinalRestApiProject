import React from "react";
import "./App.css"
import { Home } from './routes/Home';
import { About } from './routes/About';
import { Contact } from "./routes/contact";
import { Route, Routes} from 'react-router-dom';
import Products from './routes/Products';
import { Login } from "./routes/Login";
import Signup from "./components/SignUp";
import Category from "./routes/Category";

export default function App() {
  return (
    <div className="App">
      <Routes>
    <Route path="/" element={<Home/>} />
    <Route path="/product" element={<Products/>} />
    <Route path="/category" element={<Category/>} />
    <Route path="/about" element={<About/>} />
    <Route path="/contact" element={<Contact/>} />
    <Route path="/login" element={<Login/>} />
    <Route path="/signup" element={<Signup/>} />

    </Routes>
        
    
    </div>
  )
}

