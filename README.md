# easy community
轻松社区

Spring Boot，MyBatis，Reis，Kafka，Elasticsearch，Quartz等。

说明添加中~

.
├── HELP.md
├── SQL
├── log
│   └── easycommunity
│       ├── error
│       ├── info
│       └── warn
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── wxhh
│   │   │           └── easycommunity
│   │   │               ├── EasyCommunityServletInitializer.java
│   │   │               ├── EasycommunityApplication.java
│   │   │               ├── annotation
│   │   │               │   └── LoginRequired.java
│   │   │               ├── aspect
│   │   │               │   └── ServiceLogAspect.java
│   │   │               ├── config
│   │   │               │   ├── KaptchaConfig.java
│   │   │               │   ├── QuartzConfig.java
│   │   │               │   ├── RedisConfig.java
│   │   │               │   ├── SecurityConfig.java
│   │   │               │   └── WebMvcConfig.java
│   │   │               ├── controller
│   │   │               │   ├── CommentController.java
│   │   │               │   ├── DataController.java
│   │   │               │   ├── DiscussPostController.java
│   │   │               │   ├── FollowController.java
│   │   │               │   ├── HomeController.java
│   │   │               │   ├── LikeController.java
│   │   │               │   ├── LoginController.java
│   │   │               │   ├── MessageController.java
│   │   │               │   ├── SearchController.java
│   │   │               │   ├── UserController.java
│   │   │               │   ├── advice
│   │   │               │   │   └── ExceptionAdvice.java
│   │   │               │   └── interceptor
│   │   │               │       ├── DataInterceptor.java
│   │   │               │       ├── LoginRequiredInterceptor.java
│   │   │               │       ├── LoginTicketInterceptor.java
│   │   │               │       └── MessageInterceptor.java
│   │   │               ├── dao
│   │   │               │   ├── CommentMapper.java
│   │   │               │   ├── DiscussPostMapper.java
│   │   │               │   ├── LoginTicketMapper.java
│   │   │               │   ├── MessageMapper.java
│   │   │               │   ├── UserMapper.java
│   │   │               │   └── elasticsearch
│   │   │               │       └── DiscussPostRepository.java
│   │   │               ├── entity
│   │   │               │   ├── Comment.java
│   │   │               │   ├── DiscussPost.java
│   │   │               │   ├── Event.java
│   │   │               │   ├── LoginTicket.java
│   │   │               │   ├── Message.java
│   │   │               │   ├── Page.java
│   │   │               │   └── User.java
│   │   │               ├── event
│   │   │               │   ├── EventConsumer.java
│   │   │               │   └── EventProducer.java
│   │   │               ├── quartz
│   │   │               │   ├── AlphaJob.java
│   │   │               │   └── PostScoreRefreshJob.java
│   │   │               ├── service
│   │   │               │   ├── CommentService.java
│   │   │               │   ├── DataService.java
│   │   │               │   ├── DiscussPostService.java
│   │   │               │   ├── ElasticsearchService.java
│   │   │               │   ├── FollowService.java
│   │   │               │   ├── LikeService.java
│   │   │               │   ├── MessageService.java
│   │   │               │   └── UserService.java
│   │   │               └── utils
│   │   │                   ├── CookieUtil.java
│   │   │                   ├── EasyCommunityConstant.java
│   │   │                   ├── EasyCommunityUtil.java
│   │   │                   ├── HostHolder.java
│   │   │                   ├── MailClient.java
│   │   │                   ├── RedisKeyUtil.java
│   │   │                   └── SensitiveFilter.java
│   │   └── resources
│   │       ├── application-develop.properties
│   │       ├── application-produce.properties
│   │       ├── application.properties
│   │       ├── logback-spring-develop.xml
│   │       ├── logback-spring-produce.xml
│   │       ├── logback-spring.xml
│   │       ├── mapper
│   │       │   ├── comment-mapper.xml
│   │       │   ├── discusspost-mapper.xml
│   │       │   ├── message-mapper.xml
│   │       │   └── user-mapper.xml
│   │       ├── sensitive-words.txt
│   │       ├── static
│   │       │   ├── css
│   │       │   │   ├── discuss-detail.css
│   │       │   │   ├── global.css
│   │       │   │   ├── letter.css
│   │       │   │   └── login.css
│   │       │   ├── html
│   │       │   │   ├── ajax-demo.html
│   │       │   │   └── student.html
│   │       │   ├── img
│   │       │   │   ├── 404.png
│   │       │   │   ├── 500.png
│   │       │   │   ├── captcha.png
│   │       │   │   ├── error.png
│   │       │   │   └── logo-v1.png
│   │       │   └── js
│   │       │       ├── discuss.js
│   │       │       ├── global.js
│   │       │       ├── index.js
│   │       │       ├── letter.js
│   │       │       ├── profile.js
│   │       │       └── register.js
│   │       └── templates
│   │           ├── demo
│   │           ├── error
│   │           ├── index.html
│   │           ├── mail
│   │           └── site
│   └── test
│       └── java
│           └── com
│               └── wxhh
│                   └── easycommunity
│                       ├── BlockingQueueTests.java
│                       ├── EasycommunityApplicationTests.java
│                       ├── ElasticsearchTests.java
│                       ├── KafkaTests.java
│                       ├── LoggerTest.java
│                       ├── MailTest.java
│                       ├── MapperTests.java
│                       ├── QuartzTests.java
│                       ├── RedisTests.java
│                       ├── SensitiveTests.java
│                       ├── SpringBootTests.java
│                       └── ThreadPoolTests.java
├── target
├── upload
└── wk-images

