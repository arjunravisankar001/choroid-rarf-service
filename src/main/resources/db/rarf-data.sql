INSERT INTO rarf (session_id, user_id, feedback_filled, rating,
    understandable_score, confidence_score, expectations_score,
    engagement_score, organization_score, relevance_score,
    presenter_score, pace_score, most_valuable, suggestions)
VALUES
-- Feedback for caleb44's sessions
-- Session: Introduction to Machine Learning Fundamentals
('a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5d', 'peppa', true, 5, 9, 8, 9, 9, 10, 9, 10, 8, 'The hands-on examples with Python really helped solidify the concepts. The scikit-learn introduction was perfect for beginners.', 'Would love to see more real-world case studies in future sessions.'),
('a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5d', 'prayag', true, 4, 8, 7, 8, 8, 9, 8, 9, 7, 'Great foundational overview. The progression from theory to practice was well structured.', 'Could use a bit more time on feature engineering basics.'),
('a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5d', 'arjun', true, 5, 9, 9, 10, 10, 9, 10, 10, 9, 'Caleb has an amazing ability to explain complex concepts simply. The live coding session was fantastic.', 'No major suggestions - this was excellent!'),
('a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5d', 'wendy13', true, 5, 10, 8, 9, 9, 10, 9, 10, 8, 'Perfect introduction for someone transitioning into ML. The resource list provided is incredibly valuable.', 'Maybe include a brief section on model evaluation metrics.'),
('a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5d', 'ava17', true, 4, 8, 7, 8, 8, 8, 9, 9, 8, 'Good session overall. Appreciated the beginner-friendly approach.', 'Would like more interactive Q&A time.'),
('a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5d', 'marcus_dev', true, 5, 9, 8, 9, 9, 9, 10, 10, 9, 'The examples were very practical and immediately applicable. Great session!', 'Perhaps a follow-up session on intermediate topics would be great.'),

-- Session: Deep Dive into Neural Networks
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6e', 'peppa', true, 5, 9, 9, 10, 10, 9, 10, 10, 8, 'Incredibly detailed explanation of backpropagation. The TensorFlow examples were exactly what I needed.', 'Could benefit from covering more optimization algorithms.'),
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6e', 'wendy13', true, 5, 10, 9, 9, 9, 10, 9, 10, 9, 'Best neural network tutorial I have attended. The mathematical intuition was perfect.', 'Maybe add a section on debugging neural networks.'),
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6e', 'arjun', true, 4, 8, 8, 8, 9, 9, 9, 9, 7, 'Very thorough coverage. Learned a lot about network architectures.', 'Pace was a bit fast in the middle section. Otherwise great!'),
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6e', 'ava17', true, 5, 9, 8, 9, 9, 10, 10, 10, 8, 'The visualization of how neurons activate was brilliant. Really helped with understanding.', 'No suggestions - this was perfect for advanced learners.'),
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6e', 'prayag', true, 4, 8, 7, 8, 8, 8, 8, 9, 7, 'Good technical depth. The code examples were clean and well-documented.', 'Would appreciate more discussion on hyperparameter tuning.'),
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6e', 'sarah_ml', true, 5, 10, 9, 10, 10, 10, 9, 10, 9, 'Outstanding session! The way Caleb explained gradient descent was the clearest I have ever heard.', 'Maybe include some common pitfalls and how to avoid them.'),
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6e', 'tom_data', true, 5, 9, 9, 9, 9, 9, 10, 10, 8, 'Excellent balance of theory and practice. The GitHub resources are gold.', 'Could use more time on CNNs vs RNNs comparison.'),

-- Session: Natural Language Processing Workshop
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7f', 'peppa', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'The BERT demonstration was mind-blowing. Finally understand transformer architecture!', 'Would love a follow-up on fine-tuning techniques.'),
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7f', 'wendy13', true, 5, 9, 9, 9, 10, 9, 10, 10, 8, 'Comprehensive workshop. The Colab notebooks are incredibly useful for practice.', 'Maybe add more on prompt engineering for LLMs.'),
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7f', 'arjun', true, 5, 9, 8, 9, 9, 10, 9, 10, 8, 'Great coverage of modern NLP. The sentiment analysis demo was particularly good.', 'Could include more on multilingual models.'),
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7f', 'prayag', true, 4, 8, 8, 8, 9, 9, 9, 9, 7, 'Very informative. Learned a lot about tokenization and embeddings.', 'A bit rushed towards the end. Maybe extend to 3 hours?'),
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7f', 'ava17', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'This workshop exceeded all my expectations. The practical applications were spot on.', 'None - this was exceptional!'),
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7f', 'lisa_nlp', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Fantastic session on transformers. The attention mechanism explanation was crystal clear.', 'Maybe add some discussion on training costs and efficiency.'),

-- Session: Computer Vision Basics
('d4e5f6a7-b8c9-4d0e-1f2a-3b4c5d6e7f8a', 'peppa', true, 4, 8, 8, 8, 8, 9, 9, 9, 8, 'Good introduction to CV concepts. OpenCV tutorial was very practical.', 'Would like more on object detection algorithms.'),
('d4e5f6a7-b8c9-4d0e-1f2a-3b4c5d6e7f8a', 'wendy13', true, 5, 9, 8, 9, 9, 9, 9, 10, 8, 'Excellent beginner session. The image preprocessing techniques were very useful.', 'Could add more examples with different datasets.'),
('d4e5f6a7-b8c9-4d0e-1f2a-3b4c5d6e7f8a', 'arjun', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Great introduction! The CNN architecture explanation was perfect for beginners.', 'Maybe include some data augmentation techniques.'),
('d4e5f6a7-b8c9-4d0e-1f2a-3b4c5d6e7f8a', 'ava17', true, 4, 8, 7, 8, 8, 8, 9, 9, 8, 'Solid basics covered. Appreciated the hands-on exercises.', 'More time for Q&A would be helpful.'),
('d4e5f6a7-b8c9-4d0e-1f2a-3b4c5d6e7f8a', 'prayag', true, 5, 9, 8, 9, 9, 9, 9, 10, 8, 'Very clear explanations. The step-by-step approach worked well.', 'Could include some real-world deployment considerations.'),
('d4e5f6a7-b8c9-4d0e-1f2a-3b4c5d6e7f8a', 'mike_cv', true, 5, 9, 9, 10, 10, 9, 10, 10, 9, 'Perfect for someone starting in computer vision. The resources shared are excellent.', 'Would love a follow-up on advanced CV topics.'),

-- Session: Reinforcement Learning Introduction
('e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b', 'peppa', true, 5, 9, 8, 9, 10, 9, 10, 10, 8, 'RL concepts explained beautifully. The Q-learning example was very clear.', 'Would be great to cover policy gradients in more detail.'),
('e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b', 'arjun', true, 4, 8, 7, 8, 9, 9, 9, 9, 7, 'Good introduction to RL. The gaming examples helped with understanding.', 'Could use more mathematical rigor in some sections.'),
('e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b', 'wendy13', true, 5, 10, 9, 9, 9, 10, 9, 10, 8, 'Excellent session! The Markov Decision Process explanation was outstanding.', 'Maybe add some recent RL applications from industry.'),
('e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b', 'ava17', true, 5, 9, 8, 9, 9, 9, 10, 10, 9, 'Really enjoyed this session. The environment setup guide was very helpful.', 'None - great job overall!'),
('e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b', 'prayag', true, 4, 8, 8, 8, 8, 8, 9, 9, 7, 'Solid introduction. The exploration vs exploitation trade-off was well explained.', 'Would appreciate more code examples.'),
('e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9b', 'raj_rl', true, 5, 9, 9, 10, 10, 10, 10, 10, 9, 'Best RL introduction I have seen. Caleb really knows his stuff!', 'Maybe include some debugging tips for RL models.'),

-- Session: Time Series Analysis with Python
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0c', 'wendy13', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Fantastic session on time series! The ARIMA modeling was explained perfectly.', 'Could add more on LSTM for time series.'),
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0c', 'peppa', true, 5, 9, 9, 9, 9, 10, 9, 10, 8, 'Very practical approach. The Kaggle tutorial link is great for practice.', 'Maybe include some anomaly detection techniques.'),
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0c', 'arjun', true, 4, 8, 8, 8, 9, 9, 9, 9, 8, 'Good coverage of forecasting methods. Learned a lot about seasonality.', 'Could use more on multivariate time series.'),
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0c', 'ava17', true, 5, 9, 8, 9, 9, 9, 10, 10, 8, 'Excellent examples with real datasets. Very applicable to my work.', 'Would love more on prophet library.'),
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0c', 'prayag', true, 5, 9, 9, 9, 10, 9, 9, 10, 9, 'Clear and concise. The pandas operations were very useful.', 'No major suggestions - very well done!'),
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0c', 'nina_ds', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect for data scientists working with temporal data. Comprehensive and practical.', 'Maybe add cross-validation for time series.'),

-- Session: MLOps Best Practices
('a7b8c9d0-e1f2-4a3b-4c5d-6e7f8a9b0c1d', 'arjun', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'This is exactly what I needed! The Docker containerization for ML models was brilliant.', 'Could add more on model versioning tools.'),
('a7b8c9d0-e1f2-4a3b-4c5d-6e7f8a9b0c1d', 'peppa', true, 5, 9, 9, 9, 9, 10, 9, 10, 8, 'Great overview of MLOps practices. The CI/CD pipeline example was very helpful.', 'Would like more on monitoring in production.'),
('a7b8c9d0-e1f2-4a3b-4c5d-6e7f8a9b0c1d', 'wendy13', true, 5, 9, 8, 9, 9, 9, 10, 10, 9, 'Very practical session. The GitLab guide is an excellent resource.', 'Maybe include some cost optimization strategies.'),
('a7b8c9d0-e1f2-4a3b-4c5d-6e7f8a9b0c1d', 'ava17', true, 4, 8, 8, 8, 8, 9, 9, 9, 8, 'Solid introduction to MLOps. Learned about many useful tools.', 'Could be more detailed on orchestration tools.'),
('a7b8c9d0-e1f2-4a3b-4c5d-6e7f8a9b0c1d', 'prayag', true, 5, 9, 9, 10, 9, 10, 10, 10, 9, 'Outstanding session! The deployment strategies were very insightful.', 'Would appreciate more on A/B testing for models.'),
('a7b8c9d0-e1f2-4a3b-4c5d-6e7f8a9b0c1d', 'carlos_ops', true, 5, 10, 9, 9, 10, 10, 9, 10, 9, 'Best MLOps session I have attended. Very comprehensive and practical.', 'Maybe add some disaster recovery scenarios.'),

-- Session: Ethics in AI and Machine Learning
('b8c9d0e1-f2a3-4b4c-5d6e-7f8a9b0c1d2e', 'peppa', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Incredibly important topic. The bias detection examples were eye-opening.', 'Would love more case studies from different industries.'),
('b8c9d0e1-f2a3-4b4c-5d6e-7f8a9b0c1d2e', 'wendy13', true, 5, 9, 9, 9, 10, 9, 10, 10, 9, 'Excellent discussion session. Really made me think about responsible AI.', 'Could include more on regulatory frameworks.'),
('b8c9d0e1-f2a3-4b4c-5d6e-7f8a9b0c1d2e', 'arjun', true, 5, 9, 9, 10, 10, 9, 10, 10, 9, 'Very thought-provoking. The ethical framework discussion was fantastic.', 'Maybe add some tools for bias detection.'),
('b8c9d0e1-f2a3-4b4c-5d6e-7f8a9b0c1d2e', 'ava17', true, 5, 10, 9, 9, 9, 10, 10, 10, 9, 'Such an important session. Every AI practitioner should attend this.', 'None - this was perfect as is.'),
('b8c9d0e1-f2a3-4b4c-5d6e-7f8a9b0c1d2e', 'prayag', true, 4, 8, 8, 8, 9, 9, 9, 9, 8, 'Good overview of ethical considerations. The real-world examples were helpful.', 'Could dive deeper into privacy concerns.'),
('b8c9d0e1-f2a3-4b4c-5d6e-7f8a9b0c1d2e', 'emma_ethics', true, 5, 10, 10, 10, 10, 10, 10, 10, 9, 'Outstanding discussion on AI ethics. Caleb facilitated this wonderfully.', 'Would appreciate more on explainable AI.'),

-- Feedback for peppa's sessions

-- Session: Full Stack Web Development Bootcamp
('c9d0e1f2-a3b4-4c5d-6e7f-8a9b0c1d2e3f', 'caleb44', true, 5, 9, 9, 10, 10, 10, 10, 10, 8, 'Comprehensive bootcamp! The React and Node integration was explained perfectly.', 'Maybe split into two sessions given the amount of content.'),
('c9d0e1f2-a3b4-4c5d-6e7f-8a9b0c1d2e3f', 'prayag', true, 5, 9, 9, 9, 10, 9, 10, 10, 8, 'Excellent full stack overview. The GitHub repo is a goldmine of resources.', 'Could use more on authentication/authorization.'),
('c9d0e1f2-a3b4-4c5d-6e7f-8a9b0c1d2e3f', 'arjun', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Best full stack course I have taken. Peppa is an amazing instructor!', 'Would love a follow-up on deployment strategies.'),
('c9d0e1f2-a3b4-4c5d-6e7f-8a9b0c1d2e3f', 'wendy13', true, 4, 8, 8, 8, 9, 9, 9, 9, 7, 'Very thorough bootcamp. Covered a lot of ground.', 'Pace was quite fast - maybe extend duration.'),
('c9d0e1f2-a3b4-4c5d-6e7f-8a9b0c1d2e3f', 'ava17', true, 5, 9, 9, 9, 10, 10, 10, 10, 8, 'Fantastic learning experience. The hands-on projects were great.', 'More time on state management would be helpful.'),
('c9d0e1f2-a3b4-4c5d-6e7f-8a9b0c1d2e3f', 'sam_web', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Incredible bootcamp! Learned so much in just 3 hours. Peppa is excellent!', 'Maybe add some performance optimization tips.'),
('c9d0e1f2-a3b4-4c5d-6e7f-8a9b0c1d2e3f', 'julia_dev', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Very comprehensive and well-organized. The examples were practical and relevant.', 'Could include more on testing strategies.'),

-- Session: RESTful API Design Principles
('d0e1f2a3-b4c5-4d6e-7f8a-9b0c1d2e3f4a', 'caleb44', true, 5, 10, 9, 10, 9, 10, 10, 10, 9, 'Excellent API design session. The REST principles were explained clearly.', 'Would like more on API versioning strategies.'),
('d0e1f2a3-b4c5-4d6e-7f8a-9b0c1d2e3f4a', 'arjun', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Great session on API best practices. The Postman examples were very useful.', 'Could add more on rate limiting and throttling.'),
('d0e1f2a3-b4c5-4d6e-7f8a-9b0c1d2e3f4a', 'wendy13', true, 4, 8, 8, 8, 8, 9, 9, 9, 8, 'Good overview of REST principles. Learned about proper endpoint design.', 'More examples with different use cases would help.'),
('d0e1f2a3-b4c5-4d6e-7f8a-9b0c1d2e3f4a', 'prayag', true, 5, 9, 9, 9, 9, 9, 10, 10, 9, 'Very practical session. The design patterns are immediately applicable.', 'Would appreciate more on error handling.'),
('d0e1f2a3-b4c5-4d6e-7f8a-9b0c1d2e3f4a', 'ava17', true, 5, 9, 8, 9, 9, 10, 10, 10, 8, 'Clear and concise. The examples really helped cement the concepts.', 'Maybe include some security best practices.'),
('d0e1f2a3-b4c5-4d6e-7f8a-9b0c1d2e3f4a', 'oliver_api', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect session on REST APIs! Peppa covered everything comprehensively.', 'Could add documentation best practices.'),

-- Session: React Hooks Deep Dive
('e1f2a3b4-c5d6-4e7f-8a9b-0c1d2e3f4a5b', 'caleb44', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Incredible deep dive! The custom hooks examples were particularly valuable.', 'None - this was exactly what I needed.'),
('e1f2a3b4-c5d6-4e7f-8a9b-0c1d2e3f4a5b', 'arjun', true, 5, 9, 9, 9, 10, 10, 10, 10, 8, 'Excellent session on hooks. The CodeSandbox examples were great for practice.', 'Could include more on useCallback and useMemo.'),
('e1f2a3b4-c5d6-4e7f-8a9b-0c1d2e3f4a5b', 'wendy13', true, 5, 9, 8, 9, 9, 9, 9, 10, 8, 'Very thorough coverage of React hooks. Learned a lot about useEffect dependencies.', 'Maybe add some performance optimization patterns.'),
('e1f2a3b4-c5d6-4e7f-8a9b-0c1d2e3f4a5b', 'prayag', true, 4, 8, 8, 8, 9, 9, 9, 9, 7, 'Good advanced session. The hooks patterns were useful.', 'Could be more detailed on useReducer.'),
('e1f2a3b4-c5d6-4e7f-8a9b-0c1d2e3f4a5b', 'ava17', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Outstanding session! Finally understand hooks properly. Peppa is amazing!', 'Would love a follow-up on advanced patterns.'),
('e1f2a3b4-c5d6-4e7f-8a9b-0c1d2e3f4a5b', 'mia_react', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Best React hooks explanation I have seen. Very practical examples.', 'Maybe include some testing strategies for hooks.'),
('e1f2a3b4-c5d6-4e7f-8a9b-0c1d2e3f4a5b', 'noah_frontend', true, 5, 9, 9, 10, 9, 10, 10, 10, 8, 'Fantastic deep dive. The custom hooks repository is incredibly useful.', 'Could add more on hooks in TypeScript.'),

-- Session: Database Design and Optimization
('f2a3b4c5-d6e7-4f8a-9b0c-1d2e3f4a5b6c', 'caleb44', true, 5, 9, 9, 10, 9, 10, 10, 10, 9, 'Excellent database session! The normalization examples were very clear.', 'Would like more on index optimization strategies.'),
('f2a3b4c5-d6e7-4f8a-9b0c-1d2e3f4a5b6c', 'wendy13', true, 5, 10, 9, 9, 9, 10, 10, 10, 9, 'Perfect for understanding database design. The PostgreSQL tips were gold.', 'Maybe add more on query performance tuning.'),
('f2a3b4c5-d6e7-4f8a-9b0c-1d2e3f4a5b6c', 'arjun', true, 5, 9, 9, 9, 10, 10, 10, 10, 8, 'Great session on DB optimization. Learned many new techniques.', 'Could include more on partitioning strategies.'),
('f2a3b4c5-d6e7-4f8a-9b0c-1d2e3f4a5b6c', 'prayag', true, 4, 8, 8, 8, 9, 9, 9, 9, 8, 'Good coverage of database concepts. The dbdiagram examples were helpful.', 'More on NoSQL vs SQL would be interesting.'),
('f2a3b4c5-d6e7-4f8a-9b0c-1d2e3f4a5b6c', 'ava17', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Very practical session. Immediately applicable to my current projects.', 'Would appreciate more on backup strategies.'),
('f2a3b4c5-d6e7-4f8a-9b0c-1d2e3f4a5b6c', 'alex_db', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Outstanding database session! Peppa really knows PostgreSQL inside out.', 'Maybe include some scaling strategies.'),

-- Session: GraphQL vs REST: A Comparison
('a3b4c5d6-e7f8-4a9b-0c1d-2e3f4a5b6c7d', 'caleb44', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Brilliant comparison! The side-by-side examples made the differences crystal clear.', 'Would love more on when to choose each approach.'),
('a3b4c5d6-e7f8-4a9b-0c1d-2e3f4a5b6c7d', 'arjun', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Very informative session. The Apollo demo was excellent.', 'Could add more on GraphQL subscriptions.'),
('a3b4c5d6-e7f8-4a9b-0c1d-2e3f4a5b6c7d', 'wendy13', true, 4, 8, 8, 8, 9, 9, 9, 9, 8, 'Good comparison of the two approaches. Helped clarify when to use what.', 'More on performance considerations would help.'),
('a3b4c5d6-e7f8-4a9b-0c1d-2e3f4a5b6c7d', 'prayag', true, 5, 9, 9, 10, 9, 10, 10, 10, 9, 'Excellent session! The practical examples were very helpful.', 'Maybe include caching strategies for both.'),
('a3b4c5d6-e7f8-4a9b-0c1d-2e3f4a5b6c7d', 'ava17', true, 5, 9, 8, 9, 9, 9, 10, 10, 8, 'Great comparison. Now I understand GraphQL much better.', 'Would like more on schema design.'),
('a3b4c5d6-e7f8-4a9b-0c1d-2e3f4a5b6c7d', 'sophie_api', true, 5, 10, 9, 9, 10, 10, 10, 10, 9, 'Perfect comparison session! Peppa explained both approaches wonderfully.', 'Could add error handling patterns for both.'),

-- Session: Microservices Architecture Workshop
('b4c5d6e7-f8a9-4b0c-1d2e-3f4a5b6c7d8e', 'caleb44', true, 5, 9, 9, 10, 10, 10, 10, 10, 8, 'Comprehensive microservices workshop! The Kubernetes examples were fantastic.', 'Would appreciate more on service mesh concepts.'),
('b4c5d6e7-f8a9-4b0c-1d2e-3f4a5b6c7d8e', 'arjun', true, 5, 10, 10, 10, 10, 10, 10, 10, 9, 'Outstanding workshop! This is exactly what I needed for my architecture role.', 'Maybe add more on distributed tracing.'),
('b4c5d6e7-f8a9-4b0c-1d2e-3f4a5b6c7d8e', 'wendy13', true, 5, 9, 8, 9, 9, 10, 10, 10, 8, 'Excellent coverage of microservices patterns. The Miro diagrams were great.', 'Could include more on data consistency patterns.'),
('b4c5d6e7-f8a9-4b0c-1d2e-3f4a5b6c7d8e', 'prayag', true, 5, 9, 9, 9, 10, 9, 10, 10, 9, 'Very thorough workshop. Learned a lot about service decomposition.', 'Would like more on API gateway patterns.'),
('b4c5d6e7-f8a9-4b0c-1d2e-3f4a5b6c7d8e', 'ava17', true, 4, 8, 8, 8, 9, 9, 9, 9, 7, 'Good workshop on microservices. Lots of practical insights.', 'A bit fast-paced. Could extend to 3 hours.'),
('b4c5d6e7-f8a9-4b0c-1d2e-3f4a5b6c7d8e', 'liam_arch', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Best microservices workshop ever! Peppa is an architecture expert.', 'Maybe include some anti-patterns to avoid.'),
('b4c5d6e7-f8a9-4b0c-1d2e-3f4a5b6c7d8e', 'zara_dev', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Very practical and comprehensive. The Docker/K8s integration was well explained.', 'Could add more on monitoring strategies.'),

-- Session: Frontend Performance Optimization
('c5d6e7f8-a9b0-4c1d-2e3f-4a5b6c7d8e9f', 'caleb44', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Incredible session on performance! The Lighthouse analysis was eye-opening.', 'Would love more on Core Web Vitals optimization.'),
('c5d6e7f8-a9b0-4c1d-2e3f-4a5b6c7d8e9f', 'arjun', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Excellent performance tips. Immediately applied some to my projects.', 'Could include more on image optimization.'),
('c5d6e7f8-a9b0-4c1d-2e3f-4a5b6c7d8e9f', 'wendy13', true, 5, 9, 9, 9, 9, 9, 10, 10, 8, 'Very practical session. The webpack optimization techniques were great.', 'Maybe add more on lazy loading strategies.'),
('c5d6e7f8-a9b0-4c1d-2e3f-4a5b6c7d8e9f', 'prayag', true, 5, 9, 8, 9, 9, 10, 10, 10, 9, 'Great session on frontend optimization. Learned many new techniques.', 'Would appreciate more on caching strategies.'),
('c5d6e7f8-a9b0-4c1d-2e3f-4a5b6c7d8e9f', 'ava17', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Outstanding session! The real-world examples were perfect.', 'None - this was excellent!'),
('c5d6e7f8-a9b0-4c1d-2e3f-4a5b6c7d8e9f', 'ethan_perf', true, 5, 9, 9, 9, 10, 10, 10, 10, 8, 'Best performance session I have attended. Very actionable advice.', 'Could add more on PWA optimization.'),

-- Session: Testing Strategies for Web Apps
('d6e7f8a9-b0c1-4d2e-3f4a-5b6c7d8e9f0a', 'caleb44', true, 5, 9, 9, 10, 9, 10, 10, 10, 9, 'Comprehensive testing session! The Jest and Cypress examples were perfect.', 'Would like more on integration testing patterns.'),
('d6e7f8a9-b0c1-4d2e-3f4a-5b6c7d8e9f0a', 'arjun', true, 5, 10, 9, 9, 10, 10, 10, 10, 9, 'Excellent coverage of testing strategies. The GitHub examples are very useful.', 'Could include more on E2E testing best practices.'),
('d6e7f8a9-b0c1-4d2e-3f4a-5b6c7d8e9f0a', 'wendy13', true, 5, 9, 9, 9, 9, 9, 10, 10, 8, 'Very practical session on testing. The TDD approach was well explained.', 'Maybe add more on mocking strategies.'),
('d6e7f8a9-b0c1-4d2e-3f4a-5b6c7d8e9f0a', 'prayag', true, 4, 8, 8, 8, 9, 9, 9, 9, 8, 'Good testing session. Learned about different testing levels.', 'Could use more on visual regression testing.'),
('d6e7f8a9-b0c1-4d2e-3f4a-5b6c7d8e9f0a', 'ava17', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Great session on testing! The practical examples were very helpful.', 'Would appreciate coverage ratios discussion.'),
('d6e7f8a9-b0c1-4d2e-3f4a-5b6c7d8e9f0a', 'maya_qa', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect testing session! Peppa covered everything comprehensively.', 'Maybe include performance testing tools.'),

-- Feedback for prayag's sessions

-- Session: Blockchain Fundamentals
('e7f8a9b0-c1d2-4e3f-4a5b-6c7d8e9f0a1b', 'caleb44', true, 5, 9, 9, 10, 10, 10, 10, 10, 9, 'Excellent blockchain introduction! The concepts were explained very clearly.', 'Would love more on consensus mechanisms.'),
('e7f8a9b0-c1d2-4e3f-4a5b-6c7d8e9f0a1b', 'peppa', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Great foundational session. Finally understand blockchain properly!', 'Could add more practical examples.'),
('e7f8a9b0-c1d2-4e3f-4a5b-6c7d8e9f0a1b', 'arjun', true, 5, 10, 9, 9, 10, 10, 10, 10, 9, 'Perfect introduction to blockchain. The Ethereum resources are excellent.', 'Maybe include more on mining concepts.'),
('e7f8a9b0-c1d2-4e3f-4a5b-6c7d8e9f0a1b', 'wendy13', true, 4, 8, 8, 8, 9, 9, 9, 9, 8, 'Good overview of blockchain technology. Learned the basics well.', 'Could be more detailed on cryptographic concepts.'),
('e7f8a9b0-c1d2-4e3f-4a5b-6c7d8e9f0a1b', 'ava17', true, 5, 9, 8, 9, 9, 9, 10, 10, 8, 'Very informative session. Prayag explains complex concepts simply.', 'Would like more on blockchain use cases.'),
('e7f8a9b0-c1d2-4e3f-4a5b-6c7d8e9f0a1b', 'ryan_crypto', true, 5, 9, 9, 10, 10, 10, 10, 10, 9, 'Excellent blockchain introduction! Very comprehensive for beginners.', 'Maybe add more on different blockchain platforms.'),

-- Session: Smart Contract Development with Solidity
('f8a9b0c1-d2e3-4f4a-5b6c-7d8e9f0a1b2c', 'caleb44', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Outstanding Solidity workshop! The Remix examples were fantastic.', 'Would appreciate more on security patterns.'),
('f8a9b0c1-d2e3-4f4a-5b6c-7d8e9f0a1b2c', 'peppa', true, 5, 9, 9, 9, 10, 10, 10, 10, 8, 'Excellent smart contract session. Learned so much about Solidity!', 'Could include more on gas optimization.'),
('f8a9b0c1-d2e3-4f4a-5b6c-7d8e9f0a1b2c', 'arjun', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Very thorough Solidity tutorial. The contract examples were great.', 'Maybe add more on testing smart contracts.'),
('f8a9b0c1-d2e3-4f4a-5b6c-7d8e9f0a1b2c', 'wendy13', true, 4, 8, 7, 8, 9, 9, 9, 9, 7, 'Good Solidity introduction. The hands-on approach was helpful.', 'Could be slower paced for beginners.'),
('f8a9b0c1-d2e3-4f4a-5b6c-7d8e9f0a1b2c', 'ava17', true, 5, 9, 9, 10, 10, 10, 10, 10, 9, 'Fantastic workshop! Now I can write my own smart contracts.', 'Would love more on upgradeability patterns.'),
('f8a9b0c1-d2e3-4f4a-5b6c-7d8e9f0a1b2c', 'lucas_sol', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Best Solidity session ever! Prayag is an excellent teacher.', 'Maybe include deployment strategies.'),
('f8a9b0c1-d2e3-4f4a-5b6c-7d8e9f0a1b2c', 'sofia_web3', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Very comprehensive workshop. The Remix IDE walkthrough was perfect.', 'Could add more on events and logging.'),

-- Session: DeFi Protocol Analysis
('a9b0c1d2-e3f4-4a5b-6c7d-8e9f0a1b2c3d', 'caleb44', true, 5, 9, 9, 10, 10, 10, 10, 10, 9, 'Brilliant DeFi analysis! The protocol breakdowns were very insightful.', 'Would love more on yield farming mechanics.'),
('a9b0c1d2-e3f4-4a5b-6c7d-8e9f0a1b2c3d', 'peppa', true, 4, 8, 8, 8, 9, 9, 9, 9, 8, 'Good overview of DeFi protocols. Learned about different mechanisms.', 'Could include more on risks and security.'),
('a9b0c1d2-e3f4-4a5b-6c7d-8e9f0a1b2c3d', 'arjun', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Excellent DeFi session. The Dune dashboards were very useful.', 'Maybe add more on liquidity pools.'),
('a9b0c1d2-e3f4-4a5b-6c7d-8e9f0a1b2c3d', 'wendy13', true, 5, 10, 9, 9, 10, 10, 10, 10, 9, 'Outstanding analysis of DeFi protocols. Very comprehensive!', 'Would appreciate more on governance tokens.'),
('a9b0c1d2-e3f4-4a5b-6c7d-8e9f0a1b2c3d', 'ava17', true, 5, 9, 9, 10, 9, 10, 10, 10, 9, 'Fantastic session! Now I understand DeFi much better.', 'Could add more on impermanent loss.'),
('a9b0c1d2-e3f4-4a5b-6c7d-8e9f0a1b2c3d', 'max_defi', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect DeFi analysis! Prayag really knows the space well.', 'Maybe include more on cross-chain DeFi.'),

-- Session: NFT Marketplace Development
('b0c1d2e3-f4a5-4b6c-7d8e-9f0a1b2c3d4e', 'caleb44', true, 5, 9, 9, 10, 10, 10, 10, 10, 8, 'Excellent NFT workshop! The marketplace development was very practical.', 'Would love more on royalty mechanisms.'),
('b0c1d2e3-f4a5-4b6c-7d8e-9f0a1b2c3d4e', 'peppa', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Great NFT development session. Learned how to build marketplaces!', 'Could include more on metadata standards.'),
('b0c1d2e3-f4a5-4b6c-7d8e-9f0a1b2c3d4e', 'arjun', true, 5, 10, 9, 9, 9, 10, 10, 10, 8, 'Very comprehensive NFT workshop. The OpenSea guide was helpful.', 'Maybe add more on IPFS integration.'),
('b0c1d2e3-f4a5-4b6c-7d8e-9f0a1b2c3d4e', 'wendy13', true, 4, 8, 8, 8, 9, 9, 9, 9, 7, 'Good NFT session. Learned the basics of marketplace development.', 'Could be more detailed on minting process.'),
('b0c1d2e3-f4a5-4b6c-7d8e-9f0a1b2c3d4e', 'ava17', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Fantastic workshop! Now I can build my own NFT marketplace.', 'Would appreciate more on lazy minting.'),
('b0c1d2e3-f4a5-4b6c-7d8e-9f0a1b2c3d4e', 'isla_nft', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Outstanding NFT workshop! Prayag explained everything clearly.', 'Maybe include auction mechanisms.'),
('b0c1d2e3-f4a5-4b6c-7d8e-9f0a1b2c3d4e', 'jack_web3', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Excellent hands-on workshop. The code examples were very useful.', 'Could add more on gas optimization for NFTs.'),

-- Session: Cryptocurrency Trading Strategies
('c1d2e3f4-a5b6-4c7d-8e9f-0a1b2c3d4e5f', 'caleb44', true, 4, 8, 8, 9, 9, 9, 9, 9, 8, 'Interesting trading session. Learned about technical analysis.', 'Could include more on risk management.'),
('c1d2e3f4-a5b6-4c7d-8e9f-0a1b2c3d4e5f', 'peppa', true, 4, 8, 7, 8, 8, 9, 9, 9, 8, 'Good overview of trading strategies. The TradingView charts were helpful.', 'Would like more on fundamental analysis.'),
('c1d2e3f4-a5b6-4c7d-8e9f-0a1b2c3d4e5f', 'arjun', true, 5, 9, 8, 9, 9, 9, 10, 10, 9, 'Great trading session! Learned many practical strategies.', 'Maybe add more on portfolio management.'),
('c1d2e3f4-a5b6-4c7d-8e9f-0a1b2c3d4e5f', 'wendy13', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Very informative session on trading. The strategies are actionable.', 'Could include more on stop-loss strategies.'),
('c1d2e3f4-a5b6-4c7d-8e9f-0a1b2c3d4e5f', 'ava17', true, 4, 8, 8, 8, 8, 9, 9, 9, 8, 'Good trading session. Learned the basics of crypto trading.', 'More on algorithmic trading would be great.'),
('c1d2e3f4-a5b6-4c7d-8e9f-0a1b2c3d4e5f', 'eli_trader', true, 5, 9, 9, 10, 9, 10, 10, 10, 9, 'Excellent trading strategies session! Very practical advice.', 'Would appreciate more on market psychology.'),

-- Session: Layer 2 Scaling Solutions
('d2e3f4a5-b6c7-4d8e-9f0a-1b2c3d4e5f6a', 'caleb44', true, 5, 9, 9, 10, 10, 10, 10, 10, 9, 'Excellent Layer 2 session! The rollup explanations were superb.', 'Would love more on state channels.'),
('d2e3f4a5-b6c7-4d8e-9f0a-1b2c3d4e5f6a', 'peppa', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Great scaling solutions session. Finally understand L2!', 'Could add more on zkRollups.'),
('d2e3f4a5-b6c7-4d8e-9f0a-1b2c3d4e5f6a', 'arjun', true, 5, 10, 9, 9, 10, 10, 10, 10, 9, 'Outstanding L2 analysis! The L2Beat analysis was very insightful.', 'Maybe include more on optimistic rollups.'),
('d2e3f4a5-b6c7-4d8e-9f0a-1b2c3d4e5f6a', 'wendy13', true, 5, 9, 9, 9, 9, 9, 10, 10, 9, 'Very thorough L2 session. Learned about different scaling approaches.', 'Would appreciate more on sidechains.'),
('d2e3f4a5-b6c7-4d8e-9f0a-1b2c3d4e5f6a', 'ava17', true, 5, 9, 8, 9, 9, 10, 10, 10, 8, 'Fantastic session on scaling! The comparisons were very clear.', 'Could add more on Polygon and Arbitrum.'),
('d2e3f4a5-b6c7-4d8e-9f0a-1b2c3d4e5f6a', 'finn_l2', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect L2 session! Prayag covered all the major solutions.', 'Maybe include more on bridging security.'),

-- Session: Web3 Security Best Practices
('e3f4a5b6-c7d8-4e9f-0a1b-2c3d4e5f6a7b', 'caleb44', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Outstanding security session! The auditing checklist is invaluable.', 'Would love more on common vulnerabilities.'),
('e3f4a5b6-c7d8-4e9f-0a1b-2c3d4e5f6a7b', 'peppa', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Excellent Web3 security session. Very important topic!', 'Could include more on wallet security.'),
('e3f4a5b6-c7d8-4e9f-0a1b-2c3d4e5f6a7b', 'arjun', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Great security session. The ConsenSys guide is excellent.', 'Maybe add more on front-running prevention.'),
('e3f4a5b6-c7d8-4e9f-0a1b-2c3d4e5f6a7b', 'wendy13', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect security session! Every Web3 developer needs this.', 'Would appreciate more case studies.'),
('e3f4a5b6-c7d8-4e9f-0a1b-2c3d4e5f6a7b', 'ava17', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Very comprehensive security session. Learned so much!', 'Could add more on phishing prevention.'),
('e3f4a5b6-c7d8-4e9f-0a1b-2c3d4e5f6a7b', 'grace_sec', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Best Web3 security session! Prayag is very knowledgeable.', 'Maybe include more on signature verification.'),

-- Session: DAO Governance Models
('f4a5b6c7-d8e9-4f0a-1b2c-3d4e5f6a7b8c', 'caleb44', true, 5, 9, 9, 10, 9, 10, 10, 10, 9, 'Excellent DAO session! The governance models were well explained.', 'Would love more on token-weighted voting.'),
('f4a5b6c7-d8e9-4f0a-1b2c-3d4e5f6a7b8c', 'peppa', true, 5, 9, 9, 9, 9, 9, 10, 10, 9, 'Great DAO governance session. Very interesting topic!', 'Could add more on delegation mechanisms.'),
('f4a5b6c7-d8e9-4f0a-1b2c-3d4e5f6a7b8c', 'arjun', true, 4, 8, 8, 8, 9, 9, 9, 9, 8, 'Good overview of DAO governance. The Snapshot examples were helpful.', 'More on proposal processes would help.'),
('f4a5b6c7-d8e9-4f0a-1b2c-3d4e5f6a7b8c', 'wendy13', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Very informative DAO session. Learned about different models.', 'Maybe include more on treasury management.'),
('f4a5b6c7-d8e9-4f0a-1b2c-3d4e5f6a7b8c', 'ava17', true, 5, 9, 8, 9, 9, 10, 10, 10, 9, 'Fantastic session on DAOs! The governance comparisons were great.', 'Would appreciate more on voting strategies.'),
('f4a5b6c7-d8e9-4f0a-1b2c-3d4e5f6a7b8c', 'henry_dao', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect DAO governance session! Very comprehensive coverage.', 'Could add more on dispute resolution.'),

-- Feedback for arjun's sessions

-- Session: Cloud Computing with AWS
('a5b6c7d8-e9f0-4a1b-2c3d-4e5f6a7b8c9d', 'caleb44', true, 5, 9, 9, 10, 10, 10, 10, 10, 9, 'Excellent AWS session! The hands-on labs were fantastic.', 'Would love more on cost optimization.'),
('a5b6c7d8-e9f0-4a1b-2c3d-4e5f6a7b8c9d', 'peppa', true, 5, 10, 9, 9, 10, 10, 10, 10, 9, 'Outstanding AWS workshop! Learned so much about cloud services.', 'Could add more on serverless architecture.'),
('a5b6c7d8-e9f0-4a1b-2c3d-4e5f6a7b8c9d', 'prayag', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Great AWS session. The infrastructure examples were very practical.', 'Maybe include more on VPC configuration.'),
('a5b6c7d8-e9f0-4a1b-2c3d-4e5f6a7b8c9d', 'wendy13', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Very comprehensive AWS workshop. The guide is excellent.', 'Would appreciate more on S3 best practices.'),
('a5b6c7d8-e9f0-4a1b-2c3d-4e5f6a7b8c9d', 'ava17', true, 5, 9, 8, 9, 9, 9, 10, 10, 8, 'Fantastic AWS session! Great introduction to cloud computing.', 'Could add more on IAM policies.'),
('a5b6c7d8-e9f0-4a1b-2c3d-4e5f6a7b8c9d', 'owen_cloud', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Best AWS workshop! Arjun is an excellent instructor.', 'Maybe include more on EC2 instance types.'),

-- Session: Kubernetes for Beginners
('b6c7d8e9-f0a1-4b2c-3d4e-5f6a7b8c9d0e', 'caleb44', true, 5, 9, 9, 10, 10, 10, 10, 10, 8, 'Excellent K8s introduction! The hands-on approach was perfect.', 'Would love more on helm charts.'),
('b6c7d8e9-f0a1-4b2c-3d4e-5f6a7b8c9d0e', 'peppa', true, 5, 10, 9, 9, 10, 10, 10, 10, 9, 'Outstanding Kubernetes workshop! Finally understand pods and services.', 'Could add more on StatefulSets.'),
('b6c7d8e9-f0a1-4b2c-3d4e-5f6a7b8c9d0e', 'prayag', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Great K8s session. The resource examples were very helpful.', 'Maybe include more on networking.'),
('b6c7d8e9-f0a1-4b2c-3d4e-5f6a7b8c9d0e', 'wendy13', true, 4, 8, 8, 8, 9, 9, 9, 9, 7, 'Good Kubernetes introduction. Learned the fundamentals.', 'A bit fast-paced for complete beginners.'),
('b6c7d8e9-f0a1-4b2c-3d4e-5f6a7b8c9d0e', 'ava17', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Fantastic K8s workshop! The official docs link is great.', 'Would appreciate more on debugging.'),
('b6c7d8e9-f0a1-4b2c-3d4e-5f6a7b8c9d0e', 'ivy_k8s', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect Kubernetes introduction! Very comprehensive.', 'Could add more on ConfigMaps and Secrets.'),
('b6c7d8e9-f0a1-4b2c-3d4e-5f6a7b8c9d0e', 'james_ops', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Excellent beginner workshop. The examples were practical.', 'Maybe include more on namespaces.'),

-- Session: CI/CD Pipeline Design
('c7d8e9f0-a1b2-4c3d-4e5f-6a7b8c9d0e1f', 'caleb44', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Outstanding CI/CD session! The pipeline examples were excellent.', 'Would love more on GitLab CI/CD.'),
('c7d8e9f0-a1b2-4c3d-4e5f-6a7b8c9d0e1f', 'peppa', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Excellent pipeline design session. Very practical!', 'Could add more on deployment strategies.'),
('c7d8e9f0-a1b2-4c3d-4e5f-6a7b8c9d0e1f', 'prayag', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Great CI/CD session. The Jenkins examples were very useful.', 'Maybe include more on GitHub Actions.'),
('c7d8e9f0-a1b2-4c3d-4e5f-6a7b8c9d0e1f', 'wendy13', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect CI/CD workshop! Learned so much about automation.', 'Would appreciate more on testing in pipelines.'),
('c7d8e9f0-a1b2-4c3d-4e5f-6a7b8c9d0e1f', 'ava17', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Very informative session. The pipeline designs are great.', 'Could add more on artifact management.'),
('c7d8e9f0-a1b2-4c3d-4e5f-6a7b8c9d0e1f', 'kevin_cicd', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Best CI/CD session! Arjun knows pipelines inside out.', 'Maybe include more on rollback strategies.'),

-- Session: Infrastructure as Code with Terraform
('d8e9f0a1-b2c3-4d4e-5f6a-7b8c9d0e1f2a', 'caleb44', true, 5, 9, 9, 10, 10, 10, 10, 10, 9, 'Excellent Terraform workshop! The IaC concepts were clear.', 'Would love more on state management.'),
('d8e9f0a1-b2c3-4d4e-5f6a-7b8c9d0e1f2a', 'peppa', true, 5, 10, 9, 9, 10, 10, 10, 10, 9, 'Outstanding Terraform session! Finally understand IaC properly.', 'Could add more on modules.'),
('d8e9f0a1-b2c3-4d4e-5f6a-7b8c9d0e1f2a', 'prayag', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Great Terraform session. The examples were very practical.', 'Maybe include more on providers.'),
('d8e9f0a1-b2c3-4d4e-5f6a-7b8c9d0e1f2a', 'wendy13', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Very comprehensive Terraform workshop. Excellent resource!', 'Would appreciate more on workspaces.'),
('d8e9f0a1-b2c3-4d4e-5f6a-7b8c9d0e1f2a', 'ava17', true, 5, 9, 8, 9, 9, 9, 10, 10, 8, 'Fantastic Terraform session! The official examples are great.', 'Could add more on remote backends.'),
('d8e9f0a1-b2c3-4d4e-5f6a-7b8c9d0e1f2a', 'lily_iac', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect Terraform workshop! Very well structured.', 'Maybe include more on variable files.'),

-- Session: Monitoring and Logging with ELK Stack
('e9f0a1b2-c3d4-4e5f-6a7b-8c9d0e1f2a3b', 'caleb44', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Outstanding ELK session! The monitoring setup was brilliant.', 'Would love more on alert configuration.'),
('e9f0a1b2-c3d4-4e5f-6a7b-8c9d0e1f2a3b', 'peppa', true, 5, 9, 9, 9, 10, 10, 10, 10, 8, 'Excellent ELK workshop! Learned so much about observability.', 'Could add more on Kibana dashboards.'),
('e9f0a1b2-c3d4-4e5f-6a7b-8c9d0e1f2a3b', 'prayag', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Great ELK session. The Elastic resources were very helpful.', 'Maybe include more on Logstash pipelines.'),
('e9f0a1b2-c3d4-4e5f-6a7b-8c9d0e1f2a3b', 'wendy13', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect monitoring session! Very comprehensive coverage.', 'Would appreciate more on Beats.'),
('e9f0a1b2-c3d4-4e5f-6a7b-8c9d0e1f2a3b', 'ava17', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Fantastic ELK workshop! The practical examples were great.', 'Could add more on index management.'),
('e9f0a1b2-c3d4-4e5f-6a7b-8c9d0e1f2a3b', 'mason_elk', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Best ELK session! Arjun is very knowledgeable.', 'Maybe include more on APM.'),

-- Session: Serverless Architecture Patterns
('f0a1b2c3-d4e5-4f6a-7b8c-9d0e1f2a3b4c', 'caleb44', true, 5, 9, 9, 10, 10, 10, 10, 10, 9, 'Excellent serverless session! The Lambda patterns were great.', 'Would love more on event-driven architecture.'),
('f0a1b2c3-d4e5-4f6a-7b8c-9d0e1f2a3b4c', 'peppa', true, 5, 10, 9, 9, 10, 10, 10, 10, 9, 'Outstanding serverless workshop! Very practical patterns.', 'Could add more on cold start optimization.'),
('f0a1b2c3-d4e5-4f6a-7b8c-9d0e1f2a3b4c', 'prayag', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Great serverless session. The architecture patterns were insightful.', 'Maybe include more on API Gateway.'),
('f0a1b2c3-d4e5-4f6a-7b8c-9d0e1f2a3b4c', 'wendy13', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Very informative serverless session. Learned many patterns.', 'Would appreciate more on DynamoDB integration.'),
('f0a1b2c3-d4e5-4f6a-7b8c-9d0e1f2a3b4c', 'ava17', true, 5, 9, 8, 9, 9, 9, 10, 10, 8, 'Fantastic serverless workshop! The examples were practical.', 'Could add more on Step Functions.'),
('f0a1b2c3-d4e5-4f6a-7b8c-9d0e1f2a3b4c', 'nora_lambda', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect serverless session! Very comprehensive.', 'Maybe include more on monitoring serverless apps.'),

-- Session: Container Security Deep Dive
('a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5e', 'caleb44', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Outstanding security session! The container hardening was excellent.', 'Would love more on runtime security.'),
('a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5e', 'peppa', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Excellent container security session. Very important topic!', 'Could add more on image scanning.'),
('a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5e', 'prayag', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Great security session. The Aqua resources were very helpful.', 'Maybe include more on network policies.'),
('a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5e', 'wendy13', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect container security workshop! Very comprehensive.', 'Would appreciate more on secrets management.'),
('a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5e', 'ava17', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Fantastic security deep dive! Learned so much.', 'Could add more on compliance scanning.'),
('a1b2c3d4-e5f6-4a7b-8c9d-0e1f2a3b4c5e', 'paul_sec', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Best container security session! Arjun is excellent.', 'Maybe include more on vulnerability management.'),

-- Session: Multi-Cloud Strategy and Migration
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6f', 'caleb44', true, 5, 9, 9, 10, 10, 10, 10, 10, 9, 'Excellent multi-cloud session! The migration strategies were great.', 'Would love more on cost comparison.'),
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6f', 'peppa', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Great multi-cloud strategy session. Very insightful!', 'Could add more on vendor lock-in prevention.'),
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6f', 'prayag', true, 5, 10, 9, 9, 10, 10, 10, 10, 9, 'Outstanding migration session! The Cloud Academy guide is excellent.', 'Maybe include more on data migration.'),
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6f', 'wendy13', true, 4, 8, 8, 8, 9, 9, 9, 9, 8, 'Good multi-cloud overview. Learned about different strategies.', 'Could be more detailed on specific tools.'),
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6f', 'ava17', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Very informative session. The strategy discussions were valuable.', 'Would appreciate more on hybrid cloud.'),
('b2c3d4e5-f6a7-4b8c-9d0e-1f2a3b4c5d6f', 'quinn_cloud', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect multi-cloud session! Very comprehensive coverage.', 'Could add more on disaster recovery.'),

-- Feedback for wendy13's sessions

-- Session: Data Science with Python
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7a', 'caleb44', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Outstanding data science session! The pandas examples were perfect.', 'Would love more on scikit-learn.'),
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7a', 'peppa', true, 5, 9, 9, 9, 10, 10, 10, 10, 8, 'Excellent Python for data science! The Kaggle notebooks are great.', 'Could add more on data cleaning.'),
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7a', 'prayag', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Great data science session. Very comprehensive introduction.', 'Maybe include more on matplotlib.'),
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7a', 'arjun', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect data science workshop! Wendy is an amazing teacher.', 'Would appreciate more on numpy.'),
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7a', 'ava17', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Fantastic session! Learned so much about Python for data science.', 'Could add more on seaborn.'),
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7a', 'ruby_ds', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Best data science introduction! Very practical examples.', 'Maybe include more on EDA techniques.'),
('c3d4e5f6-a7b8-4c9d-0e1f-2a3b4c5d6e7a', 'sean_py', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Excellent comprehensive session. The notebooks are invaluable.', 'Would like more on data types and structures.'),

-- Session: Statistical Analysis for Data Scientists
('d4e5f6a7-b8c9-4d0e-1f2a-3b4c5d6e7f8b', 'caleb44', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Excellent statistics session! The hypothesis testing was brilliant.', 'Would love more on ANOVA.'),
('d4e5f6a7-b8c9-4d0e-1f2a-3b4c5d6e7f8b', 'peppa', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Great statistical analysis session. The R examples were helpful.', 'Could add more on regression analysis.'),
('d4e5f6a7-b8c9-4d0e-1f2a-3b4c5d6e7f8b', 'prayag', true, 4, 8, 8, 8, 9, 9, 9, 9, 7, 'Good statistics session. Learned the fundamentals well.', 'Could be more detailed on distributions.'),
('d4e5f6a7-b8c9-4d0e-1f2a-3b4c5d6e7f8b', 'arjun', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Very comprehensive statistics session. Excellent content!', 'Maybe include more on p-values.'),
('d4e5f6a7-b8c9-4d0e-1f2a-3b4c5d6e7f8b', 'ava17', true, 5, 9, 8, 9, 9, 9, 10, 10, 8, 'Fantastic statistics workshop! The RStudio link is great.', 'Would appreciate more on confidence intervals.'),
('d4e5f6a7-b8c9-4d0e-1f2a-3b4c5d6e7f8b', 'tara_stats', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect statistics session! Wendy explained everything clearly.', 'Could add more on chi-square tests.'),

-- Session: Data Visualization with D3.js
('e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9c', 'caleb44', true, 5, 9, 9, 10, 10, 10, 10, 10, 9, 'Outstanding D3 session! The visualizations were stunning.', 'Would love more on interactive charts.'),
('e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9c', 'peppa', true, 5, 10, 9, 9, 10, 10, 10, 10, 9, 'Excellent D3.js workshop! The Observable notebooks are amazing.', 'Could add more on scales and axes.'),
('e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9c', 'prayag', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Great D3 session. The examples were very impressive.', 'Maybe include more on transitions.'),
('e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9c', 'arjun', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Very creative visualization session. Learned a lot!', 'Would appreciate more on geographical maps.'),
('e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9c', 'ava17', true, 5, 9, 8, 9, 9, 9, 10, 10, 8, 'Fantastic D3 workshop! The visualizations were beautiful.', 'Could add more on force layouts.'),
('e5f6a7b8-c9d0-4e1f-2a3b-4c5d6e7f8a9c', 'uma_viz', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Best D3.js session! Wendy is a visualization expert.', 'Maybe include more on brush interactions.'),

-- Session: Big Data Processing with Spark
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0d', 'caleb44', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Excellent Spark session! The distributed processing was well explained.', 'Would love more on Spark SQL.'),
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0d', 'peppa', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Great big data session. The Databricks examples were fantastic.', 'Could add more on RDDs.'),
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0d', 'prayag', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Outstanding Spark workshop! Very comprehensive coverage.', 'Maybe include more on Spark Streaming.'),
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0d', 'arjun', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect big data session! Learned so much about Spark.', 'Would appreciate more on performance tuning.'),
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0d', 'ava17', true, 4, 8, 8, 8, 9, 9, 9, 9, 7, 'Good Spark introduction. Lots of content covered.', 'A bit overwhelming - maybe split into two sessions.'),
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0d', 'victor_spark', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Best Spark workshop! Wendy knows big data very well.', 'Could add more on MLlib.'),
('f6a7b8c9-d0e1-4f2a-3b4c-5d6e7f8a9b0d', 'will_data', true, 5, 9, 9, 9, 9, 10, 10, 10, 8, 'Excellent hands-on session. The examples were very practical.', 'Maybe include more on DataFrames API.'),

-- Session: A/B Testing and Experimentation
('a7b8c9d0-e1f2-4a3b-4c5d-6e7f8a9b0c1e', 'caleb44', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Outstanding A/B testing session! The statistical rigor was perfect.', 'Would love more on multi-variate testing.'),
('a7b8c9d0-e1f2-4a3b-4c5d-6e7f8a9b0c1e', 'peppa', true, 5, 9, 9, 9, 10, 10, 10, 10, 9, 'Excellent experimentation session. Very practical approach!', 'Could add more on sample size calculation.'),
('a7b8c9d0-e1f2-4a3b-4c5d-6e7f8a9b0c1e', 'prayag', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Great A/B testing session. The Optimizely guide was helpful.', 'Maybe include more on sequential testing.'),
('a7b8c9d0-e1f2-4a3b-4c5d-6e7f8a9b0c1e', 'arjun', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Perfect experimentation workshop! Very comprehensive.', 'Would appreciate more on causal inference.'),
('a7b8c9d0-e1f2-4a3b-4c5d-6e7f8a9b0c1e', 'ava17', true, 5, 9, 9, 9, 9, 10, 10, 10, 9, 'Fantastic A/B testing session! Learned proper methodology.', 'Could add more on experiment design.'),
('a7b8c9d0-e1f2-4a3b-4c5d-6e7f8a9b0c1e', 'xena_exp', true, 5, 10, 9, 10, 10, 10, 10, 10, 9, 'Best A/B testing session! Wendy is an experimentation expert.', 'Maybe include more examples.');
