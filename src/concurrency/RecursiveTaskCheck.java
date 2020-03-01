package concurrency;

import java.util.concurrent.RecursiveTask;

public class RecursiveTaskCheck extends RecursiveTask<Long> {

  @Override
  protected Long compute() {
    return 1L;
  }
}
