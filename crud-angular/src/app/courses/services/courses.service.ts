import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Course } from '../interfaces/course';
import { tap } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  private readonly API = 'api/courses'

  constructor(private httpClient: HttpClient) { }

  list() {
    return this.httpClient.get<Course[]>(this.API)
    .pipe(
      tap((element) => console.log(element))
      );
  }
}