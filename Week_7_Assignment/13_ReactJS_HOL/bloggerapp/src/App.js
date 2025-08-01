import React from 'react';
import './App.css';
import CourseDetails from './Components/CourseDetails';
import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';

function App() {
  return (
    <div className="App">
      <div className="container">
        <CourseDetails />
        <BookDetails />
        <BlogDetails />
      </div>
    </div>
  );
}

export default App;
