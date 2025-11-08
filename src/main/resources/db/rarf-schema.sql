-- Create the 'rarf' table (MySQL version)
CREATE TABLE rarf (
    session_id CHAR(36) NOT NULL,
    user_id VARCHAR(255) NOT NULL,
    feedback_filled TINYINT(1) NOT NULL DEFAULT 0,
    rating INT,

    understandable_score INT,
    confidence_score INT,
    expectations_score INT,
    engagement_score INT,
    organization_score INT,
    relevance_score INT,
    presenter_score INT,
    pace_score INT,

    most_valuable TEXT,
    suggestions TEXT,

    PRIMARY KEY (session_id, user_id),

    CHECK (rating BETWEEN 0 AND 5),
    CHECK (understandable_score BETWEEN 0 AND 10),
    CHECK (confidence_score BETWEEN 0 AND 10),
    CHECK (expectations_score BETWEEN 0 AND 10),
    CHECK (engagement_score BETWEEN 0 AND 10),
    CHECK (organization_score BETWEEN 0 AND 10),
    CHECK (relevance_score BETWEEN 0 AND 10),
    CHECK (presenter_score BETWEEN 0 AND 10),
    CHECK (pace_score BETWEEN 0 AND 10)
);
