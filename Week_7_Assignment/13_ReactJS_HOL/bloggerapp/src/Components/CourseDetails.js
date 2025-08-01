import React from 'react';

function CourseDetails() {
  const courses = [
    { id: 1, name: "Angular", date: "4/5/2021" },
    { id: 2, name: "React", date: "6/3/2021" }
  ];

  return (
    <div className="section">
      <h2>Course Details</h2>
      {courses.map(course => (
        <div key={course.id}>
          <h4>{course.name}</h4>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
