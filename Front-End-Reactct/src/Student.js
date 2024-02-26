import React , {useEffect, useState} from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Container,Paper} from '@mui/material';
import Button from '@mui/material/Button';

export default function Student() {
    const paperStyle = {padding:'50px 20px',width:600,margin:'20px auto'}
    const[name,setName] = useState('')
    const [addres,setAddres] = useState('')
    const[students,setStudents] = useState([])
    


    const handleClick=(e)=>{
      e.preventDefault();
      const student = {name,addres};
      fetch("http://localhost:8080/student/add",{
        method:"POST",
        headers:{"Content-Type":"application/json"},
        body:JSON.stringify(student),
      }).then(()=>{
        console.log("New Student added");
      })
    }  


    useEffect(()=>{
      fetch("http://localhost:8080/student/getAll")
      .then(res=>res.json())
      .then((result)=>{
        setStudents(result);
      }
    )},[])

  return (
    <Container>
        <Paper elevation={3} style={paperStyle}>
            <h1 style={{color:"blue"}}><u>Add Student.</u></h1>
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1 },
      }}
      noValidate
      autoComplete="off"
    >
      <TextField id="outlined-basic" label="Student Name" variant="outlined" fullWidth
      value={name}
      onChange={(e)=>setName(e.target.value)}/>
      <TextField id="outlined-basic" label="Student Addres" variant="outlined" fullWidth
       value={addres}
       onChange={(e)=>setAddres(e.target.value)}/>
       <Button variant="contained"  onClick={handleClick}>
        Contained</Button>
    </Box>
      </Paper>

      <h1>Students</h1>
      <Paper elevation={3} style={paperStyle}>
        {students.map(student=>(
          <Paper elevation={6} style={{margin:"10px",padding:"15px",textAlign:"left"}} key={student.id}>
            Id:{student.id}<br />
            Name:{student.name}<br />
            Addres:{student.addres}
          </Paper>
         )
        )}

      </Paper>

    </Container>
  );
}
