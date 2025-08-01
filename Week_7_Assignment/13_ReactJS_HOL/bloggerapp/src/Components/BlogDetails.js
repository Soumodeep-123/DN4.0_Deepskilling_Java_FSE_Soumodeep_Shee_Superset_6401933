import React from 'react';

function BlogDetails() {
  const blogs = [
    {
      id: 1,
      title: "React Learning",
      author: "Stephen Biz",
      content: "Welcome to learning React!"
    },
    {
      id: 2,
      title: "Installation",
      author: "Schwarzdenier",
      content: "You can install React from npm."
    }
  ];

  return (
    <div className="section">
      <h2>Blog Details</h2>
      {blogs.map(blog => (
        <div key={blog.id}>
          <h4>{blog.title}</h4>
          <p><strong>{blog.author}</strong></p>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
