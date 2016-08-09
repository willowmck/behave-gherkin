package behave.gherkin;

public class BehaveReports {

    /**
     * JSON report output from the Behave tutorial
     */
    public static final String SIMPLE_REPORT = "[\n" +
        "{\n" +
        "  \"elements\": [\n" +
        "    {\n" +
        "      \"keyword\": \"Scenario\", \n" +
        "      \"location\": \"simple.feature:4\", \n" +
        "      \"name\": \"run a simple test\", \n" +
        "      \"steps\": [\n" +
        "        {\n" +
        "          \"keyword\": \"Given\", \n" +
        "          \"location\": \"simple.feature:5\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"steps/simple.py:3\"\n" +
        "          }, \n" +
        "          \"name\": \"we have behave installed\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.19862580299377441, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"given\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"When\", \n" +
        "          \"location\": \"simple.feature:6\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"steps/simple.py:7\"\n" +
        "          }, \n" +
        "          \"name\": \"we implement a test\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 5.1975250244140625e-05, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"when\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"Then\", \n" +
        "          \"location\": \"simple.feature:7\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"steps/simple.py:11\"\n" +
        "          }, \n" +
        "          \"name\": \"behave will test it for us!\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 5.1975250244140625e-05, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"then\"\n" +
        "        }\n" +
        "      ], \n" +
        "      \"tags\": [], \n" +
        "      \"type\": \"scenario\"\n" +
        "    }\n" +
        "  ], \n" +
        "  \"keyword\": \"Feature\", \n" +
        "  \"location\": \"simple.feature:2\", \n" +
        "  \"name\": \"showing off behave\", \n" +
        "  \"status\": \"passed\", \n" +
        "  \"tags\": []\n" +
        "}\n" +
        "]";
    
    public final static String COMPLEX_REPORT = "[\n" +
        "{\n" +
        "  \"elements\": [\n" +
        "    {\n" +
        "      \"keyword\": \"Scenario\", \n" +
        "      \"location\": \"test/features/env_start.feature:4\", \n" +
        "      \"name\": \"Start an environment successfully\", \n" +
        "      \"steps\": [\n" +
        "        {\n" +
        "          \"keyword\": \"Given\", \n" +
        "          \"location\": \"test/features/env_start.feature:5\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_start.py:18\"\n" +
        "          }, \n" +
        "          \"name\": \"a stopped environment with inventory describing host and init script order\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.0068950653076171875, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"given\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"When\", \n" +
        "          \"location\": \"test/features/env_start.feature:6\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_start.py:32\"\n" +
        "          }, \n" +
        "          \"name\": \"I execute start\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 2.1258931159973145, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"when\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"Then\", \n" +
        "          \"location\": \"test/features/env_start.feature:7\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_start.py:41\"\n" +
        "          }, \n" +
        "          \"name\": \"I would expect a message confirming all start scripts were run\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.003036975860595703, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"then\"\n" +
        "        }\n" +
        "      ], \n" +
        "      \"tags\": [\n" +
        "        \"wip\"\n" +
        "      ], \n" +
        "      \"type\": \"scenario\"\n" +
        "    }, \n" +
        "    {\n" +
        "      \"keyword\": \"Scenario\", \n" +
        "      \"location\": \"test/features/env_start.feature:10\", \n" +
        "      \"name\": \"Start an environment with init script errors\", \n" +
        "      \"steps\": [\n" +
        "        {\n" +
        "          \"keyword\": \"Given\", \n" +
        "          \"location\": \"test/features/env_start.feature:11\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_start.py:50\"\n" +
        "          }, \n" +
        "          \"name\": \"a stopped environment that will have init script errors on startup\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.007447004318237305, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"given\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"When\", \n" +
        "          \"location\": \"test/features/env_start.feature:12\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_start.py:32\"\n" +
        "          }, \n" +
        "          \"name\": \"I execute start\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 1.5676350593566895, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"when\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"Then\", \n" +
        "          \"location\": \"test/features/env_start.feature:13\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_start.py:64\"\n" +
        "          }, \n" +
        "          \"name\": \"I would expect a message saying that init scripts had errors\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.0027899742126464844, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"then\"\n" +
        "        }\n" +
        "      ], \n" +
        "      \"tags\": [\n" +
        "        \"wip\"\n" +
        "      ], \n" +
        "      \"type\": \"scenario\"\n" +
        "    }\n" +
        "  ], \n" +
        "  \"keyword\": \"Feature\", \n" +
        "  \"location\": \"test/features/env_start.feature:1\", \n" +
        "  \"name\": \"Start all services across an environment\", \n" +
        "  \"status\": \"passed\", \n" +
        "  \"tags\": []\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "  \"elements\": [\n" +
        "    {\n" +
        "      \"keyword\": \"Scenario\", \n" +
        "      \"location\": \"test/features/env_status.feature:4\", \n" +
        "      \"name\": \"All processes are running\", \n" +
        "      \"steps\": [\n" +
        "        {\n" +
        "          \"keyword\": \"Given\", \n" +
        "          \"location\": \"test/features/env_status.feature:5\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_status.py:18\"\n" +
        "          }, \n" +
        "          \"name\": \"a fully running environment with inventory describing the hosts\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.0076389312744140625, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"given\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"When\", \n" +
        "          \"location\": \"test/features/env_status.feature:6\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_status.py:80\"\n" +
        "          }, \n" +
        "          \"name\": \"I execute status\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 2.580598831176758, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"when\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"Then\", \n" +
        "          \"location\": \"test/features/env_status.feature:7\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_status.py:89\"\n" +
        "          }, \n" +
        "          \"name\": \"I would expect a message confirming that all services are UP\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.002618074417114258, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"then\"\n" +
        "        }\n" +
        "      ], \n" +
        "      \"tags\": [\n" +
        "        \"wip\"\n" +
        "      ], \n" +
        "      \"type\": \"scenario\"\n" +
        "    }, \n" +
        "    {\n" +
        "      \"keyword\": \"Scenario\", \n" +
        "      \"location\": \"test/features/env_status.feature:10\", \n" +
        "      \"name\": \"Some but not all processes are running\", \n" +
        "      \"steps\": [\n" +
        "        {\n" +
        "          \"keyword\": \"Given\", \n" +
        "          \"location\": \"test/features/env_status.feature:11\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_status.py:32\"\n" +
        "          }, \n" +
        "          \"name\": \"a partially running environment with inventory describing the hosts\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.008041143417358398, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"given\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"When\", \n" +
        "          \"location\": \"test/features/env_status.feature:12\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_status.py:80\"\n" +
        "          }, \n" +
        "          \"name\": \"I execute status\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 2.7836477756500244, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"when\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"Then\", \n" +
        "          \"location\": \"test/features/env_status.feature:13\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_status.py:98\"\n" +
        "          }, \n" +
        "          \"name\": \"I would expect a message confirming that some services are UP and some DOWN\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.002824068069458008, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"then\"\n" +
        "        }\n" +
        "      ], \n" +
        "      \"tags\": [\n" +
        "        \"wip\"\n" +
        "      ], \n" +
        "      \"type\": \"scenario\"\n" +
        "    }, \n" +
        "    {\n" +
        "      \"keyword\": \"Scenario\", \n" +
        "      \"location\": \"test/features/env_status.feature:16\", \n" +
        "      \"name\": \"Init scripts reporting services are down, but not all processes have terminated\", \n" +
        "      \"steps\": [\n" +
        "        {\n" +
        "          \"keyword\": \"Given\", \n" +
        "          \"location\": \"test/features/env_status.feature:17\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_status.py:46\"\n" +
        "          }, \n" +
        "          \"name\": \"an environment where init scripts are reporting services down, but not all processes have terminated\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.009486913681030273, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"given\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"When\", \n" +
        "          \"location\": \"test/features/env_status.feature:18\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_status.py:80\"\n" +
        "          }, \n" +
        "          \"name\": \"I execute status\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 2.1916069984436035, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"when\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"Then\", \n" +
        "          \"location\": \"test/features/env_status.feature:19\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_status.py:107\"\n" +
        "          }, \n" +
        "          \"name\": \"I would expect a message saying that lingering processes were found\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.0027370452880859375, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"then\"\n" +
        "        }\n" +
        "      ], \n" +
        "      \"tags\": [\n" +
        "        \"wip\"\n" +
        "      ], \n" +
        "      \"type\": \"scenario\"\n" +
        "    }, \n" +
        "    {\n" +
        "      \"keyword\": \"Scenario\", \n" +
        "      \"location\": \"test/features/env_status.feature:22\", \n" +
        "      \"name\": \"All processes are down\", \n" +
        "      \"steps\": [\n" +
        "        {\n" +
        "          \"keyword\": \"Given\", \n" +
        "          \"location\": \"test/features/env_status.feature:23\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_status.py:63\"\n" +
        "          }, \n" +
        "          \"name\": \"a fully stopped environment with inventory describing the hosts\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.009969949722290039, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"given\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"When\", \n" +
        "          \"location\": \"test/features/env_status.feature:24\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_status.py:80\"\n" +
        "          }, \n" +
        "          \"name\": \"I execute status\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 3.1889030933380127, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"when\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"Then\", \n" +
        "          \"location\": \"test/features/env_status.feature:25\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_status.py:117\"\n" +
        "          }, \n" +
        "          \"name\": \"I would expect a message confirming all services are DOWN\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.002602815628051758, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"then\"\n" +
        "        }\n" +
        "      ], \n" +
        "      \"tags\": [\n" +
        "        \"wip\"\n" +
        "      ], \n" +
        "      \"type\": \"scenario\"\n" +
        "    }\n" +
        "  ], \n" +
        "  \"keyword\": \"Feature\", \n" +
        "  \"location\": \"test/features/env_status.feature:1\", \n" +
        "  \"name\": \"Check status on processes for an environment\", \n" +
        "  \"status\": \"passed\", \n" +
        "  \"tags\": []\n" +
        "},\n" +
        "\n" +
        "{\n" +
        "  \"elements\": [\n" +
        "    {\n" +
        "      \"keyword\": \"Scenario\", \n" +
        "      \"location\": \"test/features/env_stop.feature:4\", \n" +
        "      \"name\": \"Stop an environment successfully\", \n" +
        "      \"steps\": [\n" +
        "        {\n" +
        "          \"keyword\": \"Given\", \n" +
        "          \"location\": \"test/features/env_stop.feature:5\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_stop.py:18\"\n" +
        "          }, \n" +
        "          \"name\": \"a running environment with inventory describing host and init script order\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.008582115173339844, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"given\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"When\", \n" +
        "          \"location\": \"test/features/env_stop.feature:6\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_stop.py:32\"\n" +
        "          }, \n" +
        "          \"name\": \"I execute stop\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 1.5614559650421143, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"when\"\n" +
        "        }, \n" +
        "        {\n" +
        "          \"keyword\": \"Then\", \n" +
        "          \"location\": \"test/features/env_stop.feature:7\", \n" +
        "          \"match\": {\n" +
        "            \"arguments\": [], \n" +
        "            \"location\": \"test/features/steps/env_stop.py:41\"\n" +
        "          }, \n" +
        "          \"name\": \"I would expect a message confirming all stop scripts were run\", \n" +
        "          \"result\": {\n" +
        "            \"duration\": 0.0026140213012695312, \n" +
        "            \"status\": \"passed\"\n" +
        "          }, \n" +
        "          \"step_type\": \"then\"\n" +
        "        }\n" +
        "      ], \n" +
        "      \"tags\": [\n" +
        "        \"wip\"\n" +
        "      ], \n" +
        "      \"type\": \"scenario\"\n" +
        "    }\n" +
        "  ], \n" +
        "  \"keyword\": \"Feature\", \n" +
        "  \"location\": \"test/features/env_stop.feature:1\", \n" +
        "  \"name\": \"Stop all services across an environment\", \n" +
        "  \"status\": \"passed\", \n" +
        "  \"tags\": []\n" +
        "}\n" +
        "]\n" +
        "\n" +
        "";
    
    
    public final static String TEST_WITH_STDOUT_AND_ERRORS = "[\n" +
"{\n" +
"  \"elements\": [\n" +
"    {\n" +
"      \"keyword\": \"Scenario\",\n" +
"      \"location\": \"test/features/env_start.feature:4\",\n" +
"      \"name\": \"Start an environment successfully\",\n" +
"      \"steps\": [\n" +
"        {\n" +
"          \"keyword\": \"Given\",\n" +
"          \"location\": \"test/features/env_start.feature:5\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_start.py:18\"\n" +
"          },\n" +
"          \"name\": \"a stopped environment with inventory describing host and init script order\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.016826868057250977,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"given\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"When\",\n" +
"          \"location\": \"test/features/env_start.feature:6\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_start.py:32\"\n" +
"          },\n" +
"          \"name\": \"I execute start\",\n" +
"          \"result\": {\n" +
"            \"duration\": 1.9359309673309326,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"when\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"Then\",\n" +
"          \"location\": \"test/features/env_start.feature:7\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_start.py:41\"\n" +
"          },\n" +
"          \"name\": \"I would expect a message confirming all start scripts were run\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.003990888595581055,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"then\"\n" +
"        }\n" +
"      ],\n" +
"      \"tags\": [\n" +
"        \"wip\"\n" +
"      ],\n" +
"      \"type\": \"scenario\"\n" +
"    },\n" +
"    {\n" +
"      \"keyword\": \"Scenario\",\n" +
"      \"location\": \"test/features/env_start.feature:10\",\n" +
"      \"name\": \"Start an environment with init script errors\",\n" +
"      \"steps\": [\n" +
"        {\n" +
"          \"keyword\": \"Given\",\n" +
"          \"location\": \"test/features/env_start.feature:11\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_start.py:50\"\n" +
"          },\n" +
"          \"name\": \"a stopped environment that will have init script errors on startup\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.016141891479492188,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"given\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"When\",\n" +
"          \"location\": \"test/features/env_start.feature:12\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_start.py:32\"\n" +
"          },\n" +
"          \"name\": \"I execute start\",\n" +
"          \"result\": {\n" +
"            \"duration\": 1.38948392868042,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"when\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"Then\",\n" +
"          \"location\": \"test/features/env_start.feature:13\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_start.py:64\"\n" +
"          },\n" +
"          \"name\": \"I would expect a message saying that init scripts had errors\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.004040956497192383,\n" +
"            \"error_message\": [\n" +
"              \"Traceback (most recent call last):\",\n" +
"              \"  File \\\"/Users/tester/dev/venv/lib/python2.7/site-packages/behave/model.py\\\", line 1456, in run\",\n" +
"              \"    match.run(runner.context)\",\n" +
"              \"  File \\\"/Users/tester/dev/venv/lib/python2.7/site-packages/behave/model.py\\\", line 1903, in run\",\n" +
"              \"    self.func(context, *args, **kwargs)\",\n" +
"              \"  File \\\"test/features/steps/env_start.py\\\", line 70, in step_impl\",\n" +
"              \"    assert rc == 0\",\n" +
"              \"AssertionError\",\n" +
"              \"\",\n" +
"              \"Captured stdout:\",\n" +
"              \"\",\n" +
"              \"Creating log file /Users/tester/logs/test/mock_envctl.log\",\n" +
"              \"\",\n" +
"              \"Creating mocked resource: /Users/tester/mock/test/test09au.com/test.servers\",\n" +
"              \"\",\n" +
"              \"Creating mocked resource: /Users/tester/mock/test/test10au.test.com/test.servers\",\n" +
"              \"\",\n" +
"              \"Creating mocked resource: /Users/tester/mock/test/test11au.test.com/test.servers\",\n" +
"              \"\",\n" +
"              \"Creating mocked resource: /Users/tester/mock/test/test11au.test.com/test.privatelasr\",\n" +
"              \"\",\n" +
"              \"Creating mocked resource: /Users/tester/mock/test/test11au.test.com/test.publiclasr\",\n" +
"              \"\",\n" +
"              \"Setting ansible_connection to local for the following hosts:\",\n" +
"              \"test01au.test.com\",\n" +
"              \"test09au.test.com\",\n" +
"              \"test10au.test.com\",\n" +
"              \"test11au.test.com\",\n" +
"              \"testts12.test.com\",\n" +
"              \"\",\n" +
"              \"\",\n" +
"              \"--> Begin execution of envctl.py module main function\",\n" +
"              \"\",\n" +
"              \"Validating inventory variables\",\n" +
"              \"  test09au.test.com\",\n" +
"              \"  test10au.test.com\",\n" +
"              \"  test11au.test.com\",\n" +
"              \"\",\n" +
"              \"Checking for init scripts on test09au.test.com\",\n" +
"              \"\",\n" +
"              \"--> Begin execution of init_check.yml playbook\",\n" +
"              \"\",\n" +
"              \"\",\n" +
"              \"PLAY [test09au.test.com] ************************************************** \",\n" +
"              \"\",\n" +
"              \"TASK: [Verify init scripts exist] ********************************************* \",\n" +
"              \"ok: [test09au.test.com] => (item=test.servers)\",\n" +
"              \"-rwxr-xr-x  1 tester  _lpoperator  323 Aug  9 10:55 /Users/tester/mock/test/test09au.test.com/test.servers\",\n" +
"              \"\",\n" +
"              \"Checking for init scripts on test10au.test.com\",\n" +
"              \"\",\n" +
"              \"--> Begin execution of init_check.yml playbook\",\n" +
"              \"\",\n" +
"              \"\",\n" +
"              \"PLAY [test10au.test.com] ************************************************** \",\n" +
"              \"\",\n" +
"              \"TASK: [Verify init scripts exist] ********************************************* \",\n" +
"              \"ok: [test10au.test.com] => (item=test.servers)\",\n" +
"              \"-rwxr-xr-x  1 tester  _lpoperator  323 Aug  9 10:55 /Users/tester/mock/test/test10au.test.com/test.servers\",\n" +
"              \"\",\n" +
"              \"Checking for init scripts on test11au.test.com\",\n" +
"              \"\",\n" +
"              \"--> Begin execution of init_check.yml playbook\",\n" +
"              \"\",\n" +
"              \"\",\n" +
"              \"PLAY [test11au.test.com] ************************************************** \",\n" +
"              \"\",\n" +
"              \"TASK: [Verify init scripts exist] ********************************************* \",\n" +
"              \"ok: [test11au.test.com] => (item=test.servers)\",\n" +
"              \"-rwxr-xr-x  1 tester  _lpoperator  344 Aug  9 10:55 /Users/tester/mock/test/test11au.test.com/test.servers\",\n" +
"              \"\",\n" +
"              \"Running start command on test09au.test.com\",\n" +
"              \"\",\n" +
"              \"--> Begin execution of init_start.yml playbook\",\n" +
"              \"\",\n" +
"              \"\",\n" +
"              \"PLAY [test09au.test.com] ************************************************** \",\n" +
"              \"\",\n" +
"              \"TASK: [Run init script with start argument] *********************************** \",\n" +
"              \"changed: [test09au.test.com] => (item=test.servers)\",\n" +
"              \"Starting  servers\",\n" +
"              \"Starting  Web Infrastructure Data Server\",\n" +
"              \"Starting  Decision Manager Common Data Server\",\n" +
"              \" Metadata Server 1 is UP\",\n" +
"              \" Object Spawner 1 is UP\",\n" +
"              \" DIP Job Runner 1 is UP\",\n" +
"              \"Starting  Cache Locator Service: ins_41415\",\n" +
"              \"waiting 30 ...\",\n" +
"              \"Starting  Environment Manager Agent\",\n" +
"              \"\",\n" +
"              \"Running start command on test10au.test.com\",\n" +
"              \"\",\n" +
"              \"--> Begin execution of init_start.yml playbook\",\n" +
"              \"\",\n" +
"              \"\",\n" +
"              \"PLAY [test10au.test.com] ************************************************** \",\n" +
"              \"\",\n" +
"              \"TASK: [Run init script with start argument] *********************************** \",\n" +
"              \"changed: [test10au.test.com] => (item=test.servers)\",\n" +
"              \"Starting  servers\",\n" +
"              \"Starting  Web Infrastructure Data Server\",\n" +
"              \"Starting  Decision Manager Common Data Server\",\n" +
"              \" Metadata Server 1 is UP\",\n" +
"              \" Object Spawner 1 is UP\",\n" +
"              \" DIP Job Runner 1 is UP\",\n" +
"              \"Starting  Cache Locator Service: ins_41415\",\n" +
"              \"waiting 30 ...\",\n" +
"              \"Starting  Environment Manager Agent\",\n" +
"              \"\",\n" +
"              \"Running start command on test11au.test.com\",\n" +
"              \"\",\n" +
"              \"--> Begin execution of init_start.yml playbook\",\n" +
"              \"\",\n" +
"              \"\",\n" +
"              \"PLAY [test11au.test.com] ************************************************** \",\n" +
"              \"\",\n" +
"              \"TASK: [Run init script with start argument] *********************************** \",\n" +
"              \"failed: [test11au.test.com] => (item=test.servers) => {\\\"changed\\\": true, \\\"cmd\\\": [\\\"/Users/tester/mock/test/test11au.test.com/test.servers\\\", \\\"start\\\"], \\\"delta\\\": \\\"0:00:00.007417\\\", \\\"end\\\": \\\"2016-08-09 10:55:41.331239\\\", \\\"item\\\": \\\"test.servers\\\", \\\"rc\\\": 1, \\\"start\\\": \\\"2016-08-09 10:55:41.323822\\\", \\\"warnings\\\": []}\",\n" +
"              \"stdout: Starting  servers\",\n" +
"              \"Starting  Web Infrastructure Data Server\",\n" +
"              \"Starting  Decision Manager Common Data Server\",\n" +
"              \" Metadata Server 1 is UP\",\n" +
"              \" Object Spawner 1 is UP\",\n" +
"              \" DIP Job Runner 1 is UP\",\n" +
"              \"Starting  Cache Locator Service: ins_41415\",\n" +
"              \"waiting 30 ...\",\n" +
"              \"ERROR: Could not start  Environment Manager Agent\",\n" +
"              \"Starting  servers\",\n" +
"              \"Starting  Web Infrastructure Data Server\",\n" +
"              \"Starting  Decision Manager Common Data Server\",\n" +
"              \" Metadata Server 1 is UP\",\n" +
"              \" Object Spawner 1 is UP\",\n" +
"              \" DIP Job Runner 1 is UP\",\n" +
"              \"Starting  Cache Locator Service: ins_41415\",\n" +
"              \"waiting 30 ...\",\n" +
"              \"ERROR: Could not start  Environment Manager Agent\",\n" +
"              \"\",\n" +
"              \"FATAL: all hosts have already failed -- aborting\",\n" +
"              \"\",\n" +
"              \"\\u001b[31mError running start command on test_MM_VA_Test. Check output of \\\"Run init script\\\" tasks above.\\u001b[0m\",\n" +
"              \"\",\n" +
"              \"Captured logging:\",\n" +
"              \"INFO:root:Creating log file /Users/tester/logs/test/mock_envctl.log\",\n" +
"              \"INFO:root:Creating mocked resource: /Users/tester/mock/test/test09au.test.com/test.servers\",\n" +
"              \"INFO:root:Creating mocked resource: /Users/tester/mock/test/test10au.test.com/test.servers\",\n" +
"              \"INFO:root:Creating mocked resource: /Users/tester/mock/test/test11au.test.com/test.servers\",\n" +
"              \"INFO:root:Creating mocked resource: /Users/tester/mock/test/test11au.test.com/test.privatelasr\",\n" +
"              \"INFO:root:Creating mocked resource: /Users/tester/mock/test/test11au.test.com/test.publiclasr\",\n" +
"              \"INFO:root:Setting ansible_connection to local for the following hosts:\",\n" +
"              \"INFO:root:test01au.test.com\",\n" +
"              \"INFO:root:test09au.test.com\",\n" +
"              \"INFO:root:test10au.test.com\",\n" +
"              \"INFO:root:test11au.test.com\",\n" +
"              \"INFO:root:testts12.test.com\",\n" +
"              \"INFO:root:--> Begin execution of envctl.py module main function\",\n" +
"              \"INFO:root:Validating inventory variables\",\n" +
"              \"INFO:root:  test09au.test.com\",\n" +
"              \"INFO:root:  test10au.test.com\",\n" +
"              \"INFO:root:  test11au.test.com\",\n" +
"              \"INFO:root:Checking for init scripts on test09au.test.com\",\n" +
"              \"INFO:root:--> Begin execution of init_check.yml playbook\",\n" +
"              \"INFO:p=38602 u=tester | :PLAY [test09au.test.com] ************************************************** \",\n" +
"              \"INFO:p=38602 u=tester | :TASK: [Verify init scripts exist] ********************************************* \",\n" +
"              \"INFO:p=38602 u=tester | :ok: [test09au.test.com] => (item=test.servers)\",\n" +
"              \"INFO:root:-rwxr-xr-x  1 tester  _lpoperator  323 Aug  9 10:55 /Users/tester/mock/test/test09au.test.com/test.servers\",\n" +
"              \"INFO:root:--> End execution of init_check.yml playbook\",\n" +
"              \"INFO:root:Checking for init scripts on test10au.test.com\",\n" +
"              \"INFO:root:--> Begin execution of init_check.yml playbook\",\n" +
"              \"INFO:p=38602 u=tester | :PLAY [test10au.test.com] ************************************************** \",\n" +
"              \"INFO:p=38602 u=tester | :TASK: [Verify init scripts exist] ********************************************* \",\n" +
"              \"INFO:p=38602 u=tester | :ok: [test10au.test.com] => (item=test.servers)\",\n" +
"              \"INFO:root:-rwxr-xr-x  1 tester  _lpoperator  323 Aug  9 10:55 /Users/tester/mock/test/test10au.test.com/test.servers\",\n" +
"              \"INFO:root:--> End execution of init_check.yml playbook\",\n" +
"              \"INFO:root:Checking for init scripts on test11au.test.com\",\n" +
"              \"INFO:root:--> Begin execution of init_check.yml playbook\",\n" +
"              \"INFO:p=38602 u=tester | :PLAY [test11au.test.com] ************************************************** \",\n" +
"              \"INFO:p=38602 u=tester | :TASK: [Verify init scripts exist] ********************************************* \",\n" +
"              \"INFO:p=38602 u=tester | :ok: [test11au.test.com] => (item=test.servers)\",\n" +
"              \"INFO:root:-rwxr-xr-x  1 tester  _lpoperator  344 Aug  9 10:55 /Users/tester/mock/test/test11au.test.com/test.servers\",\n" +
"              \"INFO:root:--> End execution of init_check.yml playbook\",\n" +
"              \"INFO:root:Running start command on test09au.test.com\",\n" +
"              \"INFO:root:--> Begin execution of init_start.yml playbook\",\n" +
"              \"INFO:p=38602 u=tester | :PLAY [test09au.test.com] ************************************************** \",\n" +
"              \"INFO:p=38602 u=tester | :TASK: [Run init script with start argument] *********************************** \",\n" +
"              \"INFO:p=38602 u=tester | :changed: [test09au.test.com] => (item=test.servers)\",\n" +
"              \"INFO:root:Starting  servers\",\n" +
"              \"Starting  Web Infrastructure Data Server\",\n" +
"              \"Starting  Decision Manager Common Data Server\",\n" +
"              \" Metadata Server 1 is UP\",\n" +
"              \" Object Spawner 1 is UP\",\n" +
"              \" DIP Job Runner 1 is UP\",\n" +
"              \"Starting  Cache Locator Service: ins_41415\",\n" +
"              \"waiting 30 ...\",\n" +
"              \"Starting  Environment Manager Agent\",\n" +
"              \"INFO:root:--> End execution of init_start.yml playbook\",\n" +
"              \"INFO:root:Running start command on test10au.test.com\",\n" +
"              \"INFO:root:--> Begin execution of init_start.yml playbook\",\n" +
"              \"INFO:p=38602 u=tester | :PLAY [test10au.test.com] ************************************************** \",\n" +
"              \"INFO:p=38602 u=tester | :TASK: [Run init script with start argument] *********************************** \",\n" +
"              \"INFO:p=38602 u=tester | :changed: [test10au.test.com] => (item=test.servers)\",\n" +
"              \"INFO:root:Starting  servers\",\n" +
"              \"Starting  Web Infrastructure Data Server\",\n" +
"              \"Starting  Decision Manager Common Data Server\",\n" +
"              \" Metadata Server 1 is UP\",\n" +
"              \" Object Spawner 1 is UP\",\n" +
"              \" DIP Job Runner 1 is UP\",\n" +
"              \"Starting  Cache Locator Service: ins_41415\",\n" +
"              \"waiting 30 ...\",\n" +
"              \"Starting  Environment Manager Agent\",\n" +
"              \"INFO:root:--> End execution of init_start.yml playbook\",\n" +
"              \"INFO:root:Running start command on test11au.test.com\",\n" +
"              \"INFO:root:--> Begin execution of init_start.yml playbook\",\n" +
"              \"INFO:p=38602 u=tester | :PLAY [test11au.test.com] ************************************************** \",\n" +
"              \"INFO:p=38602 u=tester | :TASK: [Run init script with start argument] *********************************** \",\n" +
"              \"ERROR:p=38602 u=tester | :failed: [test11au.test.com] => (item=test.servers) => {\\\"changed\\\": true, \\\"cmd\\\": [\\\"/Users/tester/mock/test/test11au.test.com/test.servers\\\", \\\"start\\\"], \\\"delta\\\": \\\"0:00:00.007417\\\", \\\"end\\\": \\\"2016-08-09 10:55:41.331239\\\", \\\"item\\\": \\\"test.servers\\\", \\\"rc\\\": 1, \\\"start\\\": \\\"2016-08-09 10:55:41.323822\\\", \\\"warnings\\\": []}\",\n" +
"              \"ERROR:p=38602 u=tester | :stdout: Starting  servers\",\n" +
"              \"Starting  Web Infrastructure Data Server\",\n" +
"              \"Starting  Decision Manager Common Data Server\",\n" +
"              \" Metadata Server 1 is UP\",\n" +
"              \" Object Spawner 1 is UP\",\n" +
"              \" DIP Job Runner 1 is UP\",\n" +
"              \"Starting  Cache Locator Service: ins_41415\",\n" +
"              \"waiting 30 ...\",\n" +
"              \"ERROR: Could not start  Environment Manager Agent\",\n" +
"              \"INFO:root:Starting  servers\",\n" +
"              \"Starting  Web Infrastructure Data Server\",\n" +
"              \"Starting  Decision Manager Common Data Server\",\n" +
"              \" Metadata Server 1 is UP\",\n" +
"              \" Object Spawner 1 is UP\",\n" +
"              \" DIP Job Runner 1 is UP\",\n" +
"              \"Starting  Cache Locator Service: ins_41415\",\n" +
"              \"waiting 30 ...\",\n" +
"              \"ERROR: Could not start  Environment Manager Agent\",\n" +
"              \"ERROR:p=38602 u=tester | :FATAL: all hosts have already failed -- aborting\",\n" +
"              \"INFO:root:--> End execution of init_start.yml playbook\",\n" +
"              \"INFO:root:Error running start command on test_MM_VA_Test. Check output of \\\"Run init script\\\" tasks above.\",\n" +
"              \"INFO:root:--> End execution of envctl.py module main function\"\n" +
"            ],\n" +
"            \"status\": \"failed\"\n" +
"          },\n" +
"          \"step_type\": \"then\"\n" +
"        }\n" +
"      ],\n" +
"      \"tags\": [\n" +
"        \"wip\"\n" +
"      ],\n" +
"      \"type\": \"scenario\"\n" +
"    }\n" +
"  ],\n" +
"  \"keyword\": \"Feature\",\n" +
"  \"location\": \"test/features/env_start.feature:1\",\n" +
"  \"name\": \"Start all services across an environment\",\n" +
"  \"status\": \"failed\",\n" +
"  \"tags\": []\n" +
"},\n" +
"\n" +
"{\n" +
"  \"elements\": [\n" +
"    {\n" +
"      \"keyword\": \"Scenario\",\n" +
"      \"location\": \"test/features/env_status.feature:4\",\n" +
"      \"name\": \"All processes are running\",\n" +
"      \"steps\": [\n" +
"        {\n" +
"          \"keyword\": \"Given\",\n" +
"          \"location\": \"test/features/env_status.feature:5\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_status.py:18\"\n" +
"          },\n" +
"          \"name\": \"a fully running environment with inventory describing the hosts\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.015338897705078125,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"given\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"When\",\n" +
"          \"location\": \"test/features/env_status.feature:6\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_status.py:80\"\n" +
"          },\n" +
"          \"name\": \"I execute status\",\n" +
"          \"result\": {\n" +
"            \"duration\": 1.3733150959014893,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"when\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"Then\",\n" +
"          \"location\": \"test/features/env_status.feature:7\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_status.py:89\"\n" +
"          },\n" +
"          \"name\": \"I would expect a message confirming that all services are UP\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.003960847854614258,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"then\"\n" +
"        }\n" +
"      ],\n" +
"      \"tags\": [\n" +
"        \"wip\"\n" +
"      ],\n" +
"      \"type\": \"scenario\"\n" +
"    },\n" +
"    {\n" +
"      \"keyword\": \"Scenario\",\n" +
"      \"location\": \"test/features/env_status.feature:10\",\n" +
"      \"name\": \"Some but not all processes are running\",\n" +
"      \"steps\": [\n" +
"        {\n" +
"          \"keyword\": \"Given\",\n" +
"          \"location\": \"test/features/env_status.feature:11\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_status.py:32\"\n" +
"          },\n" +
"          \"name\": \"a partially running environment with inventory describing the hosts\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.01645803451538086,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"given\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"When\",\n" +
"          \"location\": \"test/features/env_status.feature:12\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_status.py:80\"\n" +
"          },\n" +
"          \"name\": \"I execute status\",\n" +
"          \"result\": {\n" +
"            \"duration\": 1.411769151687622,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"when\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"Then\",\n" +
"          \"location\": \"test/features/env_status.feature:13\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_status.py:98\"\n" +
"          },\n" +
"          \"name\": \"I would expect a message confirming that some services are UP and some DOWN\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.00436091423034668,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"then\"\n" +
"        }\n" +
"      ],\n" +
"      \"tags\": [\n" +
"        \"wip\"\n" +
"      ],\n" +
"      \"type\": \"scenario\"\n" +
"    },\n" +
"    {\n" +
"      \"keyword\": \"Scenario\",\n" +
"      \"location\": \"test/features/env_status.feature:16\",\n" +
"      \"name\": \"Init scripts reporting services are down, but not all processes have terminated\",\n" +
"      \"steps\": [\n" +
"        {\n" +
"          \"keyword\": \"Given\",\n" +
"          \"location\": \"test/features/env_status.feature:17\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_status.py:46\"\n" +
"          },\n" +
"          \"name\": \"a  environment where init scripts are reporting services down, but not all processes have terminated\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.017141103744506836,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"given\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"When\",\n" +
"          \"location\": \"test/features/env_status.feature:18\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_status.py:80\"\n" +
"          },\n" +
"          \"name\": \"I execute status\",\n" +
"          \"result\": {\n" +
"            \"duration\": 1.4887399673461914,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"when\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"Then\",\n" +
"          \"location\": \"test/features/env_status.feature:19\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_status.py:107\"\n" +
"          },\n" +
"          \"name\": \"I would expect a message saying that lingering processes were found\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.0037908554077148438,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"then\"\n" +
"        }\n" +
"      ],\n" +
"      \"tags\": [\n" +
"        \"wip\"\n" +
"      ],\n" +
"      \"type\": \"scenario\"\n" +
"    },\n" +
"    {\n" +
"      \"keyword\": \"Scenario\",\n" +
"      \"location\": \"test/features/env_status.feature:22\",\n" +
"      \"name\": \"All processes are down\",\n" +
"      \"steps\": [\n" +
"        {\n" +
"          \"keyword\": \"Given\",\n" +
"          \"location\": \"test/features/env_status.feature:23\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_status.py:63\"\n" +
"          },\n" +
"          \"name\": \"a fully stopped environment with inventory describing the hosts\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.01989912986755371,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"given\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"When\",\n" +
"          \"location\": \"test/features/env_status.feature:24\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_status.py:80\"\n" +
"          },\n" +
"          \"name\": \"I execute status\",\n" +
"          \"result\": {\n" +
"            \"duration\": 1.5079498291015625,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"when\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"Then\",\n" +
"          \"location\": \"test/features/env_status.feature:25\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_status.py:117\"\n" +
"          },\n" +
"          \"name\": \"I would expect a message confirming all services are DOWN\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.003812074661254883,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"then\"\n" +
"        }\n" +
"      ],\n" +
"      \"tags\": [\n" +
"        \"wip\"\n" +
"      ],\n" +
"      \"type\": \"scenario\"\n" +
"    }\n" +
"  ],\n" +
"  \"keyword\": \"Feature\",\n" +
"  \"location\": \"test/features/env_status.feature:1\",\n" +
"  \"name\": \"Check status on  processes for an environment\",\n" +
"  \"status\": \"passed\",\n" +
"  \"tags\": []\n" +
"},\n" +
"\n" +
"{\n" +
"  \"elements\": [\n" +
"    {\n" +
"      \"keyword\": \"Scenario\",\n" +
"      \"location\": \"test/features/env_stop.feature:4\",\n" +
"      \"name\": \"Stop an environment successfully\",\n" +
"      \"steps\": [\n" +
"        {\n" +
"          \"keyword\": \"Given\",\n" +
"          \"location\": \"test/features/env_stop.feature:5\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_stop.py:18\"\n" +
"          },\n" +
"          \"name\": \"a running  environment with inventory describing host and init script order\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.018429994583129883,\n" +
"            \"status\": \"passed\"\n" +
"          },\n" +
"          \"step_type\": \"given\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"When\",\n" +
"          \"location\": \"test/features/env_stop.feature:6\",\n" +
"          \"match\": {\n" +
"            \"arguments\": [],\n" +
"            \"location\": \"test/features/steps/env_stop.py:32\"\n" +
"          },\n" +
"          \"name\": \"I execute stop\",\n" +
"          \"result\": {\n" +
"            \"duration\": 0.0003161430358886719,\n" +
"            \"error_message\": [\n" +
"              \"Traceback (most recent call last):\",\n" +
"              \"  File \\\"/Users/tester/dev/venv/lib/python2.7/site-packages/behave/model.py\\\", line 1456, in run\",\n" +
"              \"    match.run(runner.context)\",\n" +
"              \"  File \\\"/Users/tester/dev/venv/lib/python2.7/site-packages/behave/model.py\\\", line 1903, in run\",\n" +
"              \"    self.func(context, *args, **kwargs)\",\n" +
"              \"  File \\\"test/features/steps/env_stop.py\\\", line 38, in step_impl\",\n" +
"              \"    envctl.main('stop', 'test_MM_VA_Test', extra_vars_builder=vars_builder, skip_pycheck=True, extra=True)\",\n" +
"              \"TypeError: main() got an unexpected keyword argument 'extra'\",\n" +
"              \"\",\n" +
"              \"Captured stdout:\",\n" +
"              \"\",\n" +
"              \"Creating log file /Users/tester/logs/test/mock_envctl.log\",\n" +
"              \"\",\n" +
"              \"Creating mocked resource: /Users/tester/mock/test/test09au.test.com/test.servers\",\n" +
"              \"\",\n" +
"              \"Creating mocked resource: /Users/tester/mock/test/test10au.test.com/test.servers\",\n" +
"              \"\",\n" +
"              \"Creating mocked resource: /Users/tester/mock/test/test11au.test.com/test.servers\",\n" +
"              \"\",\n" +
"              \"Creating mocked resource: /Users/tester/mock/test/test11au.test.com/test.privatelasr\",\n" +
"              \"\",\n" +
"              \"Creating mocked resource: /Users/tester/mock/test/test11au.test.com/test.publiclasr\",\n" +
"              \"\",\n" +
"              \"Setting ansible_connection to local for the following hosts:\",\n" +
"              \"test01au.test.com\",\n" +
"              \"test09au.test.com\",\n" +
"              \"test10au.test.com\",\n" +
"              \"test11au.test.com\",\n" +
"              \"testts12.test.com\",\n" +
"              \"\",\n" +
"              \"\",\n" +
"              \"Captured logging:\",\n" +
"              \"INFO:root:Creating log file /Users/tester/logs/test/mock_testenvctl.log\",\n" +
"              \"INFO:root:Creating mocked resource: /Users/tester/mock/test/test09au.test.com/test.servers\",\n" +
"              \"INFO:root:Creating mocked resource: /Users/tester/mock/test/test10au.test.com/test.servers\",\n" +
"              \"INFO:root:Creating mocked resource: /Users/tester/mock/test/test11au.test.com/test.servers\",\n" +
"              \"INFO:root:Creating mocked resource: /Users/tester/mock/test/test11au.test.com/test.privatelasr\",\n" +
"              \"INFO:root:Creating mocked resource: /Users/tester/mock/test/test11au.test.com/test.publiclasr\",\n" +
"              \"INFO:root:Setting ansible_connection to local for the following hosts:\",\n" +
"              \"INFO:root:test01au.test.com\",\n" +
"              \"INFO:root:test09au.test.com\",\n" +
"              \"INFO:root:test10au.test.com\",\n" +
"              \"INFO:root:test11au.test.com\",\n" +
"              \"INFO:root:testts12.test.com\"\n" +
"            ],\n" +
"            \"status\": \"failed\"\n" +
"          },\n" +
"          \"step_type\": \"when\"\n" +
"        },\n" +
"        {\n" +
"          \"keyword\": \"Then\",\n" +
"          \"location\": \"test/features/env_stop.feature:7\",\n" +
"          \"name\": \"I would expect a message confirming all stop scripts were run\",\n" +
"          \"step_type\": \"then\"\n" +
"        }\n" +
"      ],\n" +
"      \"tags\": [\n" +
"        \"wip\"\n" +
"      ],\n" +
"      \"type\": \"scenario\"\n" +
"    }\n" +
"  ],\n" +
"  \"keyword\": \"Feature\",\n" +
"  \"location\": \"test/features/env_stop.feature:1\",\n" +
"  \"name\": \"Stop all  services across an environment\",\n" +
"  \"status\": \"failed\",\n" +
"  \"tags\": []\n" +
"}\n" +
"]";
}
