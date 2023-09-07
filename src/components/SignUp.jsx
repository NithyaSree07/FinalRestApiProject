import React ,{useState} from "react";
import { Link, useNavigate } from "react-router-dom";
import axios from "axios";
function Signup(){

  const[name,setName]=useState("")
  const[email,setEmail]=useState("")
  const[password,setPassword]=useState("")
   
  const navigate=useNavigate();
    

    const handleSubmit=(e)=>{
        e.preventDefault();
        const data={
            name:name,
            email:email,
            password:password
        }
        console.log(data)
        axios.post("http://localhost:9090/user",data)
        .then(response=>{console.log(response.data)})
        .catch(err=>{console.log(err)})

        alert("Submiited")
        navigate("/login");
    }

    return (
<div className="bg ">
        <div className="white">
        <h2>Sign-Up</h2>
            <form action="" onSubmit={handleSubmit}>
            <div className="mb-3">
                <label htmlFor="name"><strong>Name</strong></label>
                <input type="text" placeholder="Enter Name" name='name' onChange={(e)=>setName(e.target.value)}/>
                </div>

                <div className="mb-3">
                <label htmlFor="email"><strong>Email</strong></label>
                <input type="email" placeholder="Enter Email" name='email'onChange={(e)=>setEmail(e.target.value)}/>
                
                </div>

                <div className="mb-3">
                <label htmlFor="password"><strong>Password</strong></label>
                <input type="password" placeholder="Enter Password" name='password' onChange={(e)=>setPassword(e.target.value)}/>
                </div>
 
 <button type='submit' className="btn btn-success">Sign up</button>
 <p>You are agree to our terms and policies</p>
 <Link to="/" className="btn btn-success border w-100 rounded-0 text-decoration-none">Login</Link>
            </form>
        </div>
        </div>

    )
}
export default Signup
