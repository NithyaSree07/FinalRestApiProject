import './login.css'
import React ,{useState} from "react";
import { Link} from 'react-router-dom';
import Validation from './LoginValidation';


function LoginPage(){
    const[values, setValues ]=useState({
        email:'',
        password:''
    })
    const[errors, setErrors]= useState({})
    const handleInput=(event)=>{
        setValues(prev => ({...prev,[event.target.name]:[event.target.value]}));
    }

    const handleSubmit=(event)=>{
        event.preventDefault();
        setErrors(Validation(values));
    }


    return(
        <div className="bg ">
        <div className="white">
            <form action="" onSubmit={handleSubmit}>
                <div className="mb-3">
                <label htmlFor="email"><strong>Email</strong></label>
                <input type="email" placeholder="Enter Email" name='email' onChange={handleInput}/>
                {errors.email && <span className='text-danger'>{errors.email}</span>}
                </div>

                <div className="mb-3">
                <label htmlFor="password"><strong>Password</strong></label>
                <input type="password" className='text-color-black' placeholder="Enter Password" name='password' onChange={handleInput}/>
                {errors.password && <span className='text-danger'>{errors.password}</span>}
                </div>
 
 <Link to="/" className="btn btn-success">Log in</Link><br></br>
 <p>You are agree to our terms and policies</p>
 <br></br>
 <Link to="/signup" className="btn btn-success border w-100 rounded-0 text-decoration-none">Create Account</Link>
            </form>
        </div>
        </div>
    
    )
}
export default LoginPage