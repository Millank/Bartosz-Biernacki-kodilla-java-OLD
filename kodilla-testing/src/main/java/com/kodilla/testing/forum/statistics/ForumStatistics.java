package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
    Statistics statistics;
    int quantityOfUsers;
    int quantityOfPosts;
    int quantityOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
            double averageCommentsPerPost;

            public ForumStatistics(Statistics statistics) {
                this.statistics = statistics;
            }

            public void calculateAdvStatistics(Statistics statistics) {
                List<String> usersList = statistics.usersNames();
                this.quantityOfUsers = usersList.size();
                this.quantityOfPosts = statistics.postsCount();
                this.quantityOfComments = statistics.commentsCount();

                if (quantityOfUsers != 0 && quantityOfPosts != 0) {
                    this.averagePostsPerUser = (double) quantityOfPosts / quantityOfUsers;
                } else {
                    this.averageCommentsPerUser = 0;
                }

                if (quantityOfComments != 0 && quantityOfPosts != 0) {
                    this.averageCommentsPerPost = (double) quantityOfComments / quantityOfPosts;
                } else {
                    this.averageCommentsPerPost = 0;
                }
            }
}
