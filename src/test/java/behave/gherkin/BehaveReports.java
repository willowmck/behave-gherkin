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
        "          \"name\": \"a stopped SAS environment with inventory describing host and init script order\", \n" +
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
        "          \"name\": \"a stopped SAS environment that will have init script errors on startup\", \n" +
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
        "  \"name\": \"Start all SAS services across an environment\", \n" +
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
        "          \"name\": \"a fully running SAS environment with inventory describing the hosts\", \n" +
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
        "          \"name\": \"a partially running SAS environment with inventory describing the hosts\", \n" +
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
        "          \"name\": \"a SAS environment where init scripts are reporting services down, but not all processes have terminated\", \n" +
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
        "          \"name\": \"a fully stopped SAS environment with inventory describing the hosts\", \n" +
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
        "  \"name\": \"Check status on SAS processes for an environment\", \n" +
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
        "          \"name\": \"a running SAS environment with inventory describing host and init script order\", \n" +
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
        "  \"name\": \"Stop all SAS services across an environment\", \n" +
        "  \"status\": \"passed\", \n" +
        "  \"tags\": []\n" +
        "}\n" +
        "]\n" +
        "\n" +
        "";
    
}
