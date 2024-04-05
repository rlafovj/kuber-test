package com.linus.api.user;

import com.linus.api.common.component.MessengerVO;

import com.linus.api.user.model.User;
import com.linus.api.user.model.UserDTO;
import com.linus.api.user.repository.UserRepository;
import com.linus.api.user.service.UserServiceImpl;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;

@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
@CrossOrigin(origins ="*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/api/users")
@RequiredArgsConstructor
@Slf4j

public class UserController {
    private final UserServiceImpl service;
    private final UserRepository repo;

    // -------------------- Command ---------------------------

    @PostMapping(path = "")
    public ResponseEntity<MessengerVO> save(@RequestBody Map<String, UserDTO> param) {
        log.info("입력받은 정보 : {}", param );
        // User newUser = service.save(param);
        return ResponseEntity.ok(new MessengerVO());

    }

    // -------------------- Query ---------------------------

    @PostMapping(path = "/login")
    public ResponseEntity<MessengerVO> login(@RequestBody Map<?, ?> paramap) {
        Map<String, MessengerVO> response = new HashMap<>();

        String username = (String)paramap.get("username");

        //User user = service.findByUsername(username).orElse(null);

        return ResponseEntity.ok(new MessengerVO());
    }


    @GetMapping("")
    public ResponseEntity<List<UserDTO>> findAll(Pageable pageable){

        return ResponseEntity.ok(new ArrayList<UserDTO>());
    }

    @GetMapping(path="/{id}")

    public ResponseEntity<Optional<UserDTO>> findUserById(@PathVariable Long id) {

        return ResponseEntity.ok(Optional.of(new UserDTO()));
    }



    @PutMapping("/password")
    public ResponseEntity<MessengerVO> updatePassword(@RequestBody Map<?, ?> paramap) {

        return ResponseEntity.ok(new MessengerVO());
    }


    @GetMapping("/delete")
    public ResponseEntity<MessengerVO> deleteUser(@RequestBody Map<?, ?> paramap) {

        return ResponseEntity.ok(new MessengerVO());
    }


    @GetMapping("/api/user-list")
    public ResponseEntity<MessengerVO> getUserList() {

        return ResponseEntity.ok(new MessengerVO());
    }


    @GetMapping("/api/find-userbyname")
    public ResponseEntity<MessengerVO> findUserByName(@RequestBody Map<?, ?> paramap) {
        return ResponseEntity.ok(new MessengerVO());

    }


    @GetMapping("/api/find-userbyjob")
    public ResponseEntity<MessengerVO> findUserByJob(@RequestBody Map<?, ?> paramap) {
        return ResponseEntity.ok(new MessengerVO());
    }


    @GetMapping("/api/count-users")
    public ResponseEntity<MessengerVO> countUser() {
        return ResponseEntity.ok(new MessengerVO());

    }

    @GetMapping("/api/get-one")
    public ResponseEntity<MessengerVO> getOne(@RequestBody Map<?, ?> paramap) throws SQLException {
        return ResponseEntity.ok(new MessengerVO());
    }


    @GetMapping("/api/find-users")
    public ResponseEntity<MessengerVO> findUsers() throws SQLException {

        return ResponseEntity.ok(new MessengerVO());
    }


    @GetMapping("/api/get-user")
    public ResponseEntity<MessengerVO> getUser(@RequestBody Map<?, ?> paramap) throws SQLException {

        return ResponseEntity.ok(new MessengerVO());
    }


    @GetMapping("/touch-table")
    public ResponseEntity<MessengerVO> touchTable() throws SQLException {
        return ResponseEntity.ok(new MessengerVO());
    }


    @GetMapping("/remove-table")
    public ResponseEntity<MessengerVO> removeTable() throws SQLException {
        return ResponseEntity.ok(new MessengerVO());
    }

}
